package com.ch15.LambdaExpressions;

public class ConstructorRefDemo {

	public static void main(String[] args) {

		MyFunc3<MyClass<Integer>,Integer> myClassCons = MyClass<Integer>::new;

		MyClass<Integer> mc = myClassCons.func(100);

		System.out.println("Value of mc: " + mc.getVal());

	}
}
