package com.objects;

public class ObjectLifeCycle {
	
	public static void main(String[] args) {
		Object objectA = new Object();
		Object objectB = objectA;
		Object objectC = objectA;
		Object objectD = objectA;
		objectA.instanceVarible = "uno";
		System.out.println(objectD.instanceVarible);
		objectC.instanceVarible = "c";
		System.out.println(objectA.instanceVarible);
	}

}
