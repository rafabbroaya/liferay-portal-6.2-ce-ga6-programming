package com.flowControl;

public class WhileDoWhile {

	public static void main(String[] args) {

		int[] numeros = new int[10];

		test1: for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 1;
		}
		boolean existenNumeros = true;
		int contador = 0;

		test2: while (existenNumeros) {
			System.out.println("si existen: " + numeros[contador++]);
			if (contador >= numeros.length)
				existenNumeros = false;
		}

		String[] nombres = { "rafael", "erick", "jose", "renato", "bernardo" };

		int contadorDoOuter = 0;
		doLoop: do {
			System.out.println("Existen Nombres: " + ++contadorDoOuter);
			int contadorDoInner = 0;
			do {
				contadorDoInner++;
				if (nombres[contadorDoInner-1].equals("jose"))
					continue;
				System.out.println(nombres[contadorDoInner-1]);
				
			} while (contadorDoInner < nombres.length);
		} while (contadorDoOuter < nombres.length);
	}
}
