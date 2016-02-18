package com.nested.classes;

public class SampleClass {

	public static void main(String[] args) {
		

	}

	public int getHash() {
		return 11111;
	}

}

class SampleClassA extends SampleClass {
	public int getHash() {
		return 22222;
	}
}

class SampleClassB extends SampleClass {
	public int getHash() {
		return 33333;
	}
}
