package com.flowControl;

public class Switch {

	public static void main(String[] args) {
		{
			System.out.println(false);
		}
		String[] nombres = { "hola", "rafa" };
		loopFor: for (int i = 0; i < 10; i++) {
			System.out.println(i);

			int value = 1;
			final int value2= 20;
			switch (value) {
			case 1:
				System.out.println("value is 1");
				for (String string : nombres) {
					System.out.println(string + " ");
				}
				System.out.println("greater than 0");
				continue loopFor;
			case 2:
			case 3:
				System.out.println("value less than 4");
				break;
			case 5:
			case 6:
			case 7:
				System.out.println("value less than 8 and greater than 4");
				break;
			case 8:
			case 9:
			case value2 / 2:
				System.out.println("value less than 11 and greater than 7");
				break;
			default:
				System.out.println("No matching value");
				break;
			}

		}

	}

}
