package com.main;

public class MainClass {

	public static void main(String... arguments) {
		if (null != arguments && arguments.length > 0) {
			for (int i = 0; i < arguments.length; i++) {
				System.out.println("ARGUMENT ["+i+"]: "+arguments[i]);
			}
		} else {
			System.out.println("NO ARGUMENTS FOR DISPLAY");
		}
	}
	
	public static void main() {
		
	}
}
