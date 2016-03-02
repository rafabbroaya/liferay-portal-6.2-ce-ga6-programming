package com.ch15.LambdaExpressions;

public class LambdaDemo {

	public static void main(String[] args) {
		MyNumber myNumber; //Declare an interface reference
		
		//Constant
		myNumber = () -> 123.45;
		//Call getValue()
		System.out.println(myNumber.getValue());
		
		myNumber = () -> Math.random() * 100;
		System.out.println("Random Value: " + myNumber.getValue());
		System.out.println("Another Random Value: " + myNumber.getValue());
		
		// myNumber = () -> "hola"; //ERROR! 
	}
}
