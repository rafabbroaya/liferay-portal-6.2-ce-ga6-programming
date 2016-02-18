package com.methods.encapsulation;

public class ConstructorsOverload {
	{
		System.out.println("Initializer");
		name = "default";
	}

	int time;
	String name;
	double weight;

	public ConstructorsOverload() {
		this(10, "Nuevo");
		System.out.println("Constructor emty");
	}

	private ConstructorsOverload(int time, String name) {
		this.time = time;
		this.name = name;
	}

	public ConstructorsOverload(int time, String name, double weight) {
		this();
		this.time = time;
		this.name = name;
		this.weight = weight;
	}

	public void recursiveMethod(int suma) {
		if (suma <= 10) {
			System.out.println(suma);
			recursiveMethod(suma + 1);
		} else {
			return;
		}
	}

	public static void main(String[] args) {
		ConstructorsOverload constructors1 = new ConstructorsOverload();
		ConstructorsOverload constructors2 = new ConstructorsOverload(20, "Uno");
		ConstructorsOverload constructors3 = new ConstructorsOverload(20, "Dos", 12);
		System.out.println(constructors1.name);
		System.out.println(constructors1.time);
		System.out.println(constructors2.name);
		System.out.println(constructors2.time);
		constructors3.recursiveMethod(1);
		
		//PrivateConstructor privateConstructor = new PrivateConstructor();
	}
}
