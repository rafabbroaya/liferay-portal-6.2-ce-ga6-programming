package com.methods.encapsulation;

public class MethodsParameters {

	public int receivesParameters(int test[], int... test1) {
		for (int i = 0; i < test.length; i++) {
			System.out.println(test[i]);
		}
		for (int i = 0; i < test1.length; i++) {
			System.out.println(test1[i]);
		}
		return 0;
	}

	public void receivesParameters(int test[]) {
		for (int i = 0; i < test.length; i++) {
			System.out.println(test[i]);
			if (test[i] > 12) {
				return;
			}
		}
		System.out.println("Hola");
	}

	public int receivesParameters(double test[]) {
		for (int i = 0; i < test.length; i++) {
			System.out.println(test[i]);
			if (test[i] > 12) {
				return (int) test[i];
			}
		}
		System.out.println("Hola");
		return (int) test[0];
	}

	private void receivesParameters(String print) {
		System.out.println(print);
	}

	public double calcAverage(int one, double two) {
		return (one + two) / 2;
	}
	
	public double calcAverage(double one, int two) {
		return (one + two) / 2;
	}

	public static void main(String[] args) {
		int test[] = new int[5];
		int test1[] = new int[5];

		test[0] = 1;
		test[1] = 13;
		test[2] = 4;
		test[3] = 3;
		test[4] = 2;

		MethodsParameters methodsParameters = new MethodsParameters();
		methodsParameters.receivesParameters(test);

		methodsParameters.receivesParameters("hola");
		System.out.println(methodsParameters.calcAverage(2.0, 3));
	}
}
