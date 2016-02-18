package com.non_access;

public class TestNonAccess extends Abstract implements Interface{

	@Override
	public void printInterface() {
		System.out.println(intInterface);
		
	}
	
	@Override
	public void abstractClassMethod() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String... args) {
		TestNonAccess testNonAccess = new TestNonAccess();
		testNonAccess.printInterface();
	}

	

}
