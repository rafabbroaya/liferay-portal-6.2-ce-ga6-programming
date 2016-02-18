package com.primitive.variables;

public class Character {

	public static void main(String[] args) {
		
		// 2 ^ 16 = 65536
		// Char is stored as a unsigned integer value (only positive)
		
		char _16bitChar = 'a';
		char _16bitCharInt = 24;
		char _16bitCharInt2 = 65535;
		char _16bitCharacters = '\u002F';
		char _16bitCharacters2 = '\u0122';
		char i = (char)-1;
		
		System.out.println(_16bitChar);
		System.out.println(_16bitCharInt);
		System.out.println(_16bitCharInt2);
		System.out.println(_16bitCharacters);
		System.out.println(_16bitCharacters2);
		System.out.println(i);
	}
}
