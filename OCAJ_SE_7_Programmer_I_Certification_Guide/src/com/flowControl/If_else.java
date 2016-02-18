package com.flowControl;

public class If_else {

	public static void main(String[] args) {
		int score = 400;
		if ((score = score + 10) > 110)
			;

		if (score == 100)
			System.out.println("100");
		else if (score == 110)
			System.out.println("110");
		else if (score == 120)
			System.out.println("120");
		else
			System.out.println("No matching");

		boolean test;
		if (test = true)
			System.out.println(test);

	}
}
