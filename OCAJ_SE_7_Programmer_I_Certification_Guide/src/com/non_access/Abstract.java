package com.non_access;

public abstract class Abstract {
	public abstract void abstractClassMethod ();
	public void test() {
		System.out.println("test1");
	}
	public static void main(String[] args) {
		Abstract abstract1 = new Abstract() {
			
			@Override
			public void abstractClassMethod() {
				// TODO Auto-generated method stub
				
			}
		};
		abstract1.test();
		
		Interface interface1 = new Interface() {
			
			@Override
			public void printInterface() {
				System.out.println("printInterface");
				
			}
		};
		interface1.printInterface();
	}
}
