package _7.exception.handling;

public class TryCatchFinally {

	static void guru() {
		System.out.println("Hello guru");
		throw new StackOverflowError();
	}

	public static void main(String... args) {
		try {
			guru();
			return;
		} finally {
			System.out.println("Finally");
		}
	}
}
