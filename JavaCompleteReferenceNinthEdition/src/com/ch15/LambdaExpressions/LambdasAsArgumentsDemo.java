package com.ch15.LambdaExpressions;

/**
 * Use lambdas expression as an argument
 * 
 * @author rsanchez
 *
 */
public class LambdasAsArgumentsDemo {

	static String stringOp(StringFunc sf, String s) {
		return sf.func(s);
	}

	public static void main(String[] args) {
		String inStr = "test lambda as argument";
		String outStr;

		System.out.println("Here is input string: " + inStr);

		outStr = stringOp((str) -> str.toUpperCase(), inStr);

		System.out.println("The string is upper case: " + outStr);

		outStr = stringOp((str) -> {
			String returned = "";
			for (int i = 0; i < str.length(); i++) {
				if (' ' != str.charAt(i)) {
					returned += str.charAt(i);
				}
			}
			return returned;
		}, inStr);

		System.out.println("The same without spaces: " + outStr);

		StringFunc reverse = (str) -> {
			String reverseStr = "";
			int i = str.length() - 1;
			for (;;) {
				reverseStr += str.charAt(i);
				if (i == 0)
					break;
				i--;
			}
			return reverseStr;
		};

		System.out.println("The reverse: " + stringOp(reverse, inStr));
		
	}
}
