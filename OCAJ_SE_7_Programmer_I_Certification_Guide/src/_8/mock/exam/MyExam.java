package _8.mock.exam;

public class MyExam {
	void question() {
		try {
			question();
		} catch (StackOverflowError e) {
			System.out.println("caught");
		}
	}

	public static void main(String args[]) {
		new MyExam().question();
		System.out.println("Next");
	}
}