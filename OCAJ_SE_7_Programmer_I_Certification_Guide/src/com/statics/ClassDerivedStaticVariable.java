package com.statics;

public class ClassDerivedStaticVariable extends StaticMethods{

	
	public static void main(String[] args) {
		StaticMethods.MAX_AGE = 150;
		ClassDerivedStaticVariable classDerivedStaticVariable = new ClassDerivedStaticVariable();
		System.out.println(classDerivedStaticVariable.returnAge());
	}
}
