package _8.mock.exam;

import java.util.ArrayList;
import java.util.Arrays;

public class Array extends ArrayFather {
	static int count;

	public Array() {
		// TODO Auto-generated constructor stub
	}

	public Array(Array a) {
		super(a);
	}

	public static void main(String[] args) {
		Array a1 = new Array();
		Array a2 = new Array(a1);

		Array a3 = (Array) a1;

		int[] array = new int[] { 1 };

		OverFlow[] arrayOverFow = new OverFlow[] {};
		ArrayList<String> arrayListString = new ArrayList<String>();
		arrayListString.add(0, "summer");
		arrayListString.add("winter");
		for (int i = 0; i < arrayListString.size(); i++) {
			System.out.println(arrayListString.get(i));
		}

		OverFlow[][][] testO = new OverFlow[1][2][];
		OverFlow[] test = { null };
		++Array.count;

		for (OverFlow overFlow : test) {
			if (overFlow instanceof OverFlow)
				continue;
		}

		ArrayList<OverFlow> arrayListOverFlows = new ArrayList<OverFlow>();
		for (OverFlow overFlow : arrayListOverFlows) {
			arrayListOverFlows.indexOf(overFlow);
		}

		String[][] arrayMultidimensional = new String[][] { { null, "" }, {} };
		System.out.println("Length :" + arrayMultidimensional.length);
		String[] testString = new String[][] { { "A", "B" }, { "" } }[0];
		for (int i = 0; i < testString.length; i++) {
			System.out.println(testString[i]);
		}

		for (String string : testString) {
			System.out.println(string);
		}

		ArrayList<String[]> list = new ArrayList<String[]>();

		int a = 10;
		int b = 20;
		boolean c = false;
		if (b > a)
			if (++a == 10)
				if (c != true)
					System.out.println(1);
				else
					System.out.println(2);
			else
				System.out.println(3);

		for (;;) {
			System.out.println("1");
			break;
		}

		Object[] arrayObjects = new Object[] { null, new String[] { "A", "B" } };
		System.out.println(arrayObjects.getClass().isArray());
		Object[] srcPos = new Object[2];
		System.arraycopy(arrayObjects, 0, srcPos, 0, 2);

		System.out.println(((String[]) srcPos[1])[0]);

		for (int i = 0; i < 0; i++) {
			System.out.println("Test For");
		}

		int[] numeros = { 1, 2, 3, 4, 5 };
		System.arraycopy(numeros, 1, numeros, 0, 2);
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println();

		ArrayList<Integer> listaNumeros = new ArrayList<>(1);
		listaNumeros.add(null);
		listaNumeros.add(1);
		listaNumeros.add(2);
		for (Integer integer : listaNumeros) {
			System.out.print(integer);
		}

		if (true)
			;
		else
			;

	}
}

class ArrayFather {
	public ArrayFather(Array a) {
		// TODO Auto-generated constructor stub
	}

	public ArrayFather() {
		// TODO Auto-generated constructor stub
	}
}
