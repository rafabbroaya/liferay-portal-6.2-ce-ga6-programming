package com.ch15.LambdaExpressions;

public class BlockLambdaDemo {

	public static void main(String[] args) {
		NumericFunc factorial = (n) -> {
			int result = 1;
			for (int i = 2; i <= n; i++) {
				result = i * result;
			}
			return result;
		};
		
		System.out.println("The factorial of 3 is " + factorial.func(3));
		System.out.println("The factorial of 5 is " + factorial.func(5));
		System.out.println("The factorial of 6 is " + factorial.func(6));
	}
}

