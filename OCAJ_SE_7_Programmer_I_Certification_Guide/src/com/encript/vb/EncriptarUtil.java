package com.encript.vb;

import java.util.Random;

public class EncriptarUtil {

	public static String Encriptar(String clave) {
		int numero1; // Guardar el número al azar generado
		int numero2; // Guardar el número al azar generado
		String RSCDLLltado = ""; // Para guardad el texto encriptado

		Random random = new Random();
		numero1 = 38 + random.nextInt(19);
		numero2 = 109 + random.nextInt(57);

		char char1 = (char) numero1;
		String string1 = "" + numero2;
		RSCDLLltado = char1 + string1.trim();

		for (int i = 0; i < clave.length(); i++) {
			if (((int) clave.substring(i, i + 1).charAt(0) + 113) <= 198) {
				RSCDLLltado = RSCDLLltado
						+ (char) ((int) clave.substring(i, i + 1).charAt(0) + 113 + numero1);
			} else {
				RSCDLLltado = RSCDLLltado
						+ (char) ((int) clave.substring(i, i + 1).charAt(0) + 113 - numero2);
			}
		}

		return RSCDLLltado;
	}

	public static String Desencriptar(String claveEncriptada) {
		int numero1; // Guardar el primer numero a desencriptar
		int numero2; // Guardar el segundo numero a desencriptar
		String RSCDLLltado = ""; // Para guardad el texto desencriptado

		numero1 = claveEncriptada.substring(0, 1).charAt(0);
		numero2 = Integer.parseInt(claveEncriptada.substring(1, 4));

		for (int i = 4; i < claveEncriptada.length(); i++) {
			if (((int) claveEncriptada.substring(i, i + 1).charAt(0)) >= 199) {
				RSCDLLltado = RSCDLLltado
						+ (char) ((int) claveEncriptada.substring(i, i + 1)
								.charAt(0) - 113 - numero1);
			} else {
				RSCDLLltado = RSCDLLltado
						+ (char) ((int) claveEncriptada.substring(i, i + 1)
								.charAt(0) - 113 + numero2);
			}
		}

		return RSCDLLltado;
	}

	public static void main(String... args) {
		String clave = args[0];
		String claveEncriptada = Encriptar(clave);
		String claveDesencriptada = Desencriptar(claveEncriptada);
		
		System.out.println("CLAVE A ENCRIPTAR: "+clave);
		System.out.println("CLAVE ENCRIPTADA: "+claveEncriptada);
		System.out.println("CLAVE DESENCRIPTADA: "+claveDesencriptada);
	}

}
