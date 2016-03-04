package com.ch15.LambdaExpressions;

public class GenericFunctionalInterfaceDemo {
	public static void main(String[] args) {

		SomeFunc<String> reverse = (str) -> {
			String reverseString = "";

			for (int i = (str.length() - 1); i >= 0; i--) {
				reverseString += str.charAt(i);
			}

			return reverseString;
		};

		System.out.println("Reverse of \"rafael\" \"" + reverse.func("rafael") + "\"");

		SomeFunc<Integer> factorial = (n) -> {
			int result = 1;
			for (int i = 2; i <= n; i++) {
				result = i * result;
			}
			return result;
		};

		System.out.println("The factorial of 2: " + factorial.func(2));
		System.out.println("The factorial of 5: " + factorial.func(5));
	}
}
