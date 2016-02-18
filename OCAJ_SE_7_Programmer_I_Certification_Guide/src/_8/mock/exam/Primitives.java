package _8.mock.exam;

import java.util.ArrayList;

public class Primitives {

	char charValue; // \u0000

	void test(String _1) {

	}

	public static void main(String[] args) {
		Primitives primitives = new Primitives();
		System.out.println(primitives.charValue);

		char localVariableChar = '\u0001';
		System.out.println(localVariableChar);

		System.out.println(20 % 30);

		// OverFlow overFlow = new OverFlow();

	}
}

class OverFlow {
	public OverFlow() {
		System.out.println("New Object OverFlow");
	}
	// OverFlow overFlow = new OverFlow();
}
