package com.ch15.LambdaExpressions;

public class LambdaExceptionDemo {
	
	public static void main(String[] args) throws EmptyArrayException {
		double values[] = { 1, 2, 3, 4 };

		DoubleNumericArrayFunc average = (n) -> {
			double averageValue = 0;

			if (n.length == 0) {
				throw new EmptyArrayException();
			}

			for (int i = 0; i < n.length; i++) {
				averageValue += n[i] / n.length;
			}
			return averageValue;
		};
		
		System.out.println("The average is: " + average.func(values));
		System.out.println("The average is: " + average.func(new double[0]));
		
	}
}
