package com.methods.encapsulation;

public class Encapsulation {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void passObjectReferences(Encapsulation encapsulation){
		encapsulation.setAge(10);
	}
	
	public void passObjectReferencesAnother(Encapsulation encapsulation){
		Encapsulation encapsulation2 = encapsulation;
		encapsulation2.setAge(10);
	}

	
	public static void main(String[] args) {
		Encapsulation encapsulation = new Encapsulation();
		encapsulation.passObjectReferences(encapsulation);
		System.out.println(encapsulation.getAge());
		encapsulation.passObjectReferencesAnother(encapsulation);
		System.out.println(encapsulation.getAge());
	}
}
