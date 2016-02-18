package com.String;

public final class StringClass {

	public static void main(String[] args) {

		String s1 = new String("Paul");
		String s2 = new String("Paul");
		System.out.println(s1 == s2);
		String s3 = "Harry";
		String s4 = "Harry";
		System.out.println(s3 == s4);
		String s5 = "Rafael";
		System.out.println("Rafael" == s5);
		char[] ch1 = new char[] { 'R', 'a', 'f', 'a', 'e', 'l' };
		char ch2 = '2';
		char ch3 = 50;
		String s6 = new String(ch1);
		System.out.println("Rafael" == s6);
		StringBuilder sb1 = new StringBuilder("String Builder");
		String s7 = new String(sb1);
		StringBuffer sb2 = new StringBuffer("String Buffer");
		String s8 = new String(sb2);
		String s9 = null;
		System.out.println(ch3 == ch2);
		
	}
}
