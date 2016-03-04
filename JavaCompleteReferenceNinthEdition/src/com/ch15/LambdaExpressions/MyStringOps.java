package com.ch15.LambdaExpressions;

public class MyStringOps {

	static String strReverse(String str) {
		String result = "";
		int i;
		for (i = str.length() - 1; i >= 0; i--) {
			result += str.charAt(i);
		}
		return result;
	}
	
	String strReverseInstanceMethod(String str) {
		String result = "";
		int i;
		for (i = str.length() - 1; i >= 0; i--) {
			result += str.charAt(i);
		}
		return result;
	}
}
