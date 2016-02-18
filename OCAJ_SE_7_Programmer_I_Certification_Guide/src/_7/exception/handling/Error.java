package _7.exception.handling;

public class Error {
	static void myMethod() {
		System.out.println("Mi method");
		myMethod();
	}
	
	static public void main(String... a) {
		try{
			myMethod();
			System.out.println("Inside Try");
		}catch(StackOverflowError s){
			System.out.println("Error");
		}
		int i=0;
		System.out.println(i++);
		System.out.println(i);
	}
}
