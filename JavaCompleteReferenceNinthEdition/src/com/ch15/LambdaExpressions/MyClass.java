package com.ch15.LambdaExpressions;

public class MyClass<T> {
	private T val;

	MyClass(T v) {
		val = v;
	}

	public MyClass() {
		val = null;
	}

	T getVal() {
		return val;
	}
}
