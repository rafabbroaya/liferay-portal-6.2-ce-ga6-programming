package com.flowControl;

import java.util.ArrayList;
import java.util.Iterator;

import org.hamcrest.core.Is;

public class ForLoop {

	public ForLoop(int count) {
		this.count = count;
	}

	int count = 0;

	private static int increment(ForLoop forLoop) {
		retur_increment: return forLoop.count = forLoop.count + 1;
	}

	private static void printHappy() {
		System.out.println("Happy");
	}

	public static void main(String[] args) {
		ForLoop forLoop = new ForLoop(5);
		for (forLoop.count = forLoop.count; forLoop.count <= 10; ForLoop
				.increment(forLoop)) {
			System.out.println(forLoop.count);
		}

		for (int uno = 0; uno < 5; forLoop = new ForLoop(0)) {
			System.out.println(uno);
			uno++;
		}
		int count = 0;
		for (String a = "a", b = "s"; a.equalsIgnoreCase("a"); printHappy()) {
			System.out.println(a + count);
			count++;
			if (count == 5) {
				a = "b";
			}
		}

		ArrayList<String> nombres = new ArrayList<String>();
		nombres.add("rafael");
		nombres.add("Eli");

		ArrayList<Double> notas = new ArrayList<Double>();
		notas.add(18.0);
		notas.add(20.0);

		ArrayList<ArrayList<?>> alumnos = new ArrayList<ArrayList<?>>();
		alumnos.add(nombres);
		alumnos.add(notas);

		System.out.println();
		for (Iterator<String> iterator = nombres.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}

		for (String string : nombres) {
			System.out.println(string);
		}

		double totalNotas = 0;
		for (ArrayList<?> arrayList : alumnos) {
			for (Object object : arrayList) {
				if (object instanceof String)
					System.out.println((String) object);
				else {
					double nota = (double) object;
					System.out.println(nota);
					totalNotas += nota;
				}

			}
		}
		System.out.println("Total: " + totalNotas);

		for (int j = 0; j < 5; j++){
			int i = 0;
			for (;;) {
				System.out.println(i);
				i++;
				if (i > 5)
					break;
			}
		}
			
	}
}
