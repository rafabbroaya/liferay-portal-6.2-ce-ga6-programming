package com.String;

public class StringMethods {
	
	public static void main(String[] args) {
		String testMethods = "Nuevos Methodos evitados";
		
		System.out.println(testMethods.charAt(10));
		
		System.out.println(testMethods.indexOf(115));
		System.out.println(testMethods.indexOf("s"));
		System.out.println(testMethods.indexOf(115, 5));
		System.out.println(testMethods.indexOf("s", 1));
		
		System.out.println(testMethods.substring(7));
		System.out.println(testMethods.substring(7, 15));
		
		//Leading and trailing white space
		System.out.println(testMethods.trim());
		
		System.out.println(testMethods.replace('o', 'a'));
		System.out.println(testMethods.replace("ev", "ad"));
		System.out.println(testMethods.replaceAll("o", "a"));
		System.out.println(testMethods.replaceFirst("o", "a"));
		
		System.out.println(testMethods.length());
		System.out.println("test");
		System.out.println(testMethods.startsWith("N"));
		System.out.println(testMethods.startsWith("Metho", 7));
		
		System.out.println(testMethods.endsWith("os"));
		
		System.out.println(testMethods.concat(" Hola"));
		
		String letters = "ABCAB";
		System.out.println(letters.substring(0, 2).startsWith("A"));
		
		System.out.println(" Hola mundo trim ".trim());
	}
}
