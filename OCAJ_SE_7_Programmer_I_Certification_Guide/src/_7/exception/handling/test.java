package _7.exception.handling;

public class test {
	void syso() throws StackOverflowError {
		System.out.println("hola");
		syso();
	}

	public static void main(String[] args) {
		test t = new test();
		try{
			t.syso();
		}catch(StackOverflowError e){
			System.out.println("Error");
		}
	}
}
