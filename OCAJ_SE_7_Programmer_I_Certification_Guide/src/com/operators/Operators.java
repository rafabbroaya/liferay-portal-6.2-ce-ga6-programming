package com.operators;

public class Operators {

	public static void main(String[] args) {
		// Assignment
		int valor1 = 0;
		System.out.println(valor1 = 10);
		System.out.println(valor1 += 10);
		System.out.println(valor1 -= 5);
		System.out.println(valor1 *= 10);
		System.out.println(valor1 /= 3);
		System.out.println();
		// Arithmetic
		double valor2 = 0;
		System.out.println(valor2 = valor2 + 10);
		System.out.println(valor2 = valor2 - 5);
		System.out.println(valor2 = valor2 * 10);
		System.out.println(valor2 = valor2 / 5);
		System.out.println(valor2 = valor2 % 4); // modulus primitives
		System.out.println(valor2++); // modulus primitives
		System.out.println(valor2--); // modulus primitives
		System.out.println(valor2);
		System.out.println(++valor2);
		System.out.println("*******");

		// Relational
		// <, <=, >, >=, ==, !=
		boolean aBoolean = true;
		boolean bBoolean = false;
		boolean cBoolean = bBoolean = aBoolean;
		System.out.println(cBoolean);
		boolean testBoolean = valor1 != valor2;
		System.out.println(testBoolean);

		// Logical NOT, AND, OR
		// !, &&, ||
		// SHORT-CIRCUIT
		int marca1 = 10;
		int marca2 = 11;
		System.out.println(marca1 < marca2 && ++marca1 >= marca2);
		System.out.println("MARCA 1: " + marca1);

		System.out.println("TWIST IN THE TALE");
		int a = 10;
		int b = 20;
		int c = 40;
		System.out.println(a++ > 10 || ++b < 30); // line1 TRUE
		// a = 11 b = 21
		System.out.println(a > 90 && ++b < 30); // line2 FALSE
		// a = 11 b = 21
		System.out.println(!(c > 20) && a == 10); // line 3 FALSE
		// a = 11 b = 21
		System.out.println(a >= 99 || a <= 33 && b == 10); // line 4 FALSE
		// System.out.println(a >= 99 || (a <= 33 && b == 10)); //This is
		// evaluated like this because the && Operator has higher precedence
		// a = 11 b = 21
		System.out.println(a >= 99 && a <= 33 || b == 10); // line 5 FALSE
		System.out.println("*******");

		int int1 = 10, int2 = 20, int3 = 30;
		System.out.println(int1 % int2 * int3 + int1 / int2);
		// System.out.println(((int1 % int2) * int3) + (int1 / int2));
		// (10 * 30)+ (10/20) = 300 + 0 = 300
		System.out.println(10 / 20); // = 0
		System.out.println(10 / 20.0); // = 0.5

		System.out.println("*******");
		int var1 = 12 / 5;
		System.out.println(var1);
		System.out.println("*******");
		int var2 = 0;
		System.out.println(var2);
		var2++;
		++var2;
		System.out.println(var2);
		System.out.println(++var2);
		System.out.println(var2++);
		System.out.println(var2);
		System.out.println("*******");
		double varD1 = 12;
		varD1 = varD1 % 4.5;
		System.out.println(varD1);
		System.out.println("*******");
		int a1 = 10;
		a1 = a1++ + a1 + a1-- - a1-- + ++a1;
		// a = 10 + 11 + 11 - 10 + 10
		System.out.println(a1);
		a1 = 10;
		a1 = ++a1 + a1 + --a1 - --a1 + a1++;
		// a = 11 + 11 + 10 - 9 + 9
		// + 1
		System.out.println(a1);

		int int11 = 10, int12 = 20, int13 = 30;
		System.out.println(int11 % int12 * int13 + int11 / int12);

		System.out.println(13 ^ 24);

	}
}
