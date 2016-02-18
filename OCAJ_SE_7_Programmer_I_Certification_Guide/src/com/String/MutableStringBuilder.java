package com.String;

public class MutableStringBuilder {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();
		sb1.append(new char[]{'r','a','f','a'});
		sb1.append(" y ");
		sb1.append(new char[]{'e','l','i','z','a','b','e','t','h'},0,3);
		sb1.append(" ").append(true).append(" ");
		sb1.insert(0,new StringBuilderTwo("Hola"));
		sb1.insert(4, " ");
		sb1.insert(16, new char[]{' ',' ','s','a','n','c','h','e','z',' '},2,8);
		System.out.println(sb1);
		
		sb1.delete(23, sb1.length()-1);
		sb1.deleteCharAt(sb1.length()-1);
		System.out.println(sb1);
		
		sb1.reverse();
		System.out.println(sb1);
		sb1.reverse();
		
		sb1.replace(16, 23, "paredes");
		System.out.println(sb1);
		
		System.out.println(sb1.subSequence(5, 23));
	}
}

class StringBuilderTwo{
	String name;
	public StringBuilderTwo(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return this.name;
	}
}
