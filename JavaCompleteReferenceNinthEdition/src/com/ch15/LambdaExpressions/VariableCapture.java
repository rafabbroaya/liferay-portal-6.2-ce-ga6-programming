package com.ch15.LambdaExpressions;

public class VariableCapture {

	int num = 10;

	public static void main(String[] args) {

		VariableCapture var = new VariableCapture();
		final int num = 10;

		MyFunc lambda = (n) -> {
			int v = num + n;
			var.num++;
			return v;
		};
		
		System.out.println(lambda.func(10));

	}
}
