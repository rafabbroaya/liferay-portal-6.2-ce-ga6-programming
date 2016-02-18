package _8.mock.exam;

import java.io.IOException;

public class TestException {
	static int j;
	
	static void testNewException() throws ExceptionNew {

	}

	public static void main(String[] args) {

		testNewException();
		try {
			doSomething();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		try {
		doRuntimeExce$ption();
		} finally {
			
		}

	}

	static void doSomething() throws IOException {
		if (Math.random() > 0.5){
			System.out.println("Mayor");
			System.out.println(j);
			throw new IOException();}
		throw new RuntimeException();
	}
	
	static void doRuntimeExce$ption() {
		throw new RuntimeException();
	}
	
	private static abstract class InnerClass {
		int a,b,c = 0;
	}
}

class ExceptionNew extends Error {

	void exceptionNew() {
		
	}
}
