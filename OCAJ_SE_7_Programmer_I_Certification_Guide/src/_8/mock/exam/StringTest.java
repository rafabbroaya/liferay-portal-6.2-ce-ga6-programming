package _8.mock.exam;

import java.util.List;

public class StringTest {
	static String add(String str1, String str2) {
		return str1+str2;
	}
	
	static String addConcat(String str1, String str2) {
		return str1.concat(str2.substring(0));
	}
	
	static List<?> add(String str1) {
		return null;
	}

	public static void main(String[] args) {
		System.out.println(add("hola ", "mundo"));
		System.out.println(addConcat("hola ", "mundo"));
		
		StringBuilder stringBuilder = new StringBuilder();
		System.out.println(stringBuilder.capacity());
		String h1="HelloWorld";
		stringBuilder.append("Hello").append("World");
		if(h1.equals(stringBuilder))System.out.println("Equals");
		if(h1.equals(stringBuilder.toString()))System.out.println("Equals to String");
		
		System.out.println(stringBuilder.delete(0, stringBuilder.length()));
		
	}
}
