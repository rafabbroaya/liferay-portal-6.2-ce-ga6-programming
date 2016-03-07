package com.ch15.LambdaExpressions;

public class ConstructorRefDemo3 {

	static <R, T> R myClassFactory(MyFunc3<R, T> cons, T v) {
		return cons.func(v);
	}

	public static void main(String[] args) {

		MyFunc3<MyClass<Double>, Double> myClassCons = MyClass<Double>::new;

		MyClass<Double> mc = myClassFactory(myClassCons, 100.1);

		// Use the instance of MyClass just created.
		System.out.println("val in mc is " + mc.getVal());

		MyFunc3<MyClass2, String> myClassCons2 = MyClass2::new;
		MyClass2 mc2 = myClassFactory(myClassCons2, "Lambda");
		
		System.out.println("str in mc2 is " + mc2.getVal( ));
	}
}
