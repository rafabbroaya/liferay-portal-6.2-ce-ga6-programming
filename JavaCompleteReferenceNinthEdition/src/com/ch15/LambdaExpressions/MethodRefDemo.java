package com.ch15.LambdaExpressions;

public class MethodRefDemo {

	static String stringOp(StringFunc sf, String s) {
		return sf.func(s);
	}

	public static void main(String[] args) {
		String inStr = "Lambdas add power to Java";
		String outStr;
		
		//Static Method
		
		outStr = stringOp(MyStringOps::strReverse, inStr);
		System.out.println("Original String: " + inStr);
		System.out.println("String reversed: " + outStr);
		
		
		//Instance Method
		
		MyStringOps strOps = new MyStringOps( );
		
		outStr = stringOp(strOps::strReverseInstanceMethod, inStr);
		
		System.out.println("Original string: " + inStr);
		System.out.println("String reversed: " + outStr);
	}
}
