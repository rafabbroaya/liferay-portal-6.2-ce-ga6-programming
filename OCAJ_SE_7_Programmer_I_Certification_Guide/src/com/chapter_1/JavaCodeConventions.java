package com.chapter_1;

import com.Arrays.*;

//CamelCase for classes nouns
public class JavaCodeConventions {

	static final String CONSTANT_VARIABLE = "Constant";
	String myString;
	static int constante = Integer.MAX_VALUE;

	public void doMethodConvention() { // first lower case and then normal
										// CamelCase verb~noun pairs
		main(new String[]{""});
	}

	public static void main(String[] args) {
		System.out.println(CoffeeSize.HUGE.getOunces());
		for (CoffeeSize coffeeSize : CoffeeSize.values()) {
			System.out.println(coffeeSize);
		}
		Arrays a = new Arrays();
		System.out.println(constante);
	}
}

// CamelCase Adjectives
interface MakerConventions {

}

enum CoffeeSize {
	BIG(8), HUGE(10);

	CoffeeSize(int ounces) {
		this.ounces = ounces;
	}

	private int ounces;

	public int getOunces() {
		return ounces;
	}

}
