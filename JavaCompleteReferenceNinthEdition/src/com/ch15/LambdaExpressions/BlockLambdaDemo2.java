package com.ch15.LambdaExpressions;

public class BlockLambdaDemo2 {

	public static void main(String[] args) {
		StringFunc reverse = (str) -> {
			String reverseString = "";
			for (int i = str.length()-1; i >= 0; i--) {
				reverseString+=str.charAt(i);
			}
			return reverseString;
		};
		
		
		System.out.println("Reverso de \"reverso\": \""+ reverse.func("reverso")+"\"");
		System.out.println("Reverso de \"rafael\": \""+ reverse.func("rafael")+"\"");
	}

}
