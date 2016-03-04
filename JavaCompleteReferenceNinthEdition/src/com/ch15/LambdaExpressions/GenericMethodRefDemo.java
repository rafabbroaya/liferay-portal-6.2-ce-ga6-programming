package com.ch15.LambdaExpressions;

public class GenericMethodRefDemo {

	static <T> int myOp(MyFuncGenerics<T> f, T[] values, T v) {
		return f.func(values, v);
	}
	
	public static void main(String[] args) {
		
		Integer[] vals = { 1, 2, 3, 4, 2, 3, 4, 4, 5 };
		String[] strs = { "One", "Two", "Three", "Two" };
		int count;
		
		count = myOp(MyArrayOps::<Integer>countMatching, vals, 4);
		System.out.println("vals contains " + count + " 4s");
		
		count = myOp(MyArrayOps::<String>countMatching, strs, "Two");
		System.out.println("strs contains " + count + " Twos");
		
	}
}
