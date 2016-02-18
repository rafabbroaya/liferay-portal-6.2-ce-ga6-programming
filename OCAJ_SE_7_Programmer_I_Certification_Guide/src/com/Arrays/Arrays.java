package com.Arrays;

public class Arrays {

	public static void main(String[] args) {
		int s[][] = new int[Math.max(1, 3)][];

		for (int i = 0; i < 3; i++) {
			int lengSecond = (int) (Math.random() * 100);
			s[i] = new int[lengSecond];
			for (int j = 0; j < lengSecond; j++) {
				s[i][j] = j;
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < s[i].length; j++) {
				System.out.print(s[i][j]);
			}
			System.out.println();
		}

		System.out.println(s[0].length);
		System.out.println(s[1].length);
		System.out.println(s[2].length);

		String _10ValoresString[] = new String[10];
		for (int i = 0; i < _10ValoresString.length; i++) {
			System.out.print(_10ValoresString[i] + " ");
		}
		System.out.println();
		int _10ValoresInt[] = new int[10];
		for (int i = 0; i < _10ValoresInt.length; i++) {
			System.out.print(_10ValoresInt[i] + " ");
		}
		System.out.println();
		int[] multiArray[] = new int[][] { { 2, 3 }, { 4, 5 } };
		for (int i = 0; i < multiArray.length; i++) {
			for (int j = 0; j < multiArray[i].length; j++) {
				System.out.print(multiArray[i][j] + " ");
			}
		}
		System.out.println();
		String[] stringArray = { "uno", null, "tres" };
		for (int i = 0; i < stringArray.length; i++) {
			System.out.print(stringArray[i] + " ");
		}
		System.out.println();
		int numeros[];
		numeros = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println();

		String multiString[][] = new String[][] { {"uno","dos"}, null, {"lun","mar","mie","jue","vie",null,null} };
		//System.out.println(multiString[1][0]);
		
		String testString = "hola";
		System.out.println(testString.length());
		
		int[] arr1;
		int[] arr2 = new int[3];
		char[] arr3 = {'a', 'b'};
		arr1 = arr2;
		//arr1 = (int)arr3;
	}

}
