package com.ch15.LambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;

public class UseMethodRef {

	static int compareMC(MyClass<Integer> a, MyClass<Integer> b) {
		return a.getVal() - b.getVal();
	}

	public static void main(String[] args) {

		ArrayList<MyClass<Integer>> al = new ArrayList<MyClass<Integer>>();

		al.add(new MyClass<Integer>(1));
		al.add(new MyClass<Integer>(4));
		al.add(new MyClass<Integer>(2));
		al.add(new MyClass<Integer>(9));
		al.add(new MyClass<Integer>(3));
		al.add(new MyClass<Integer>(7));
		
		MyClass<Integer> maxValObj = Collections.max(al, UseMethodRef::compareMC);
		
		System.out.println("Maximum value is: " + maxValObj.getVal());
	}

}
