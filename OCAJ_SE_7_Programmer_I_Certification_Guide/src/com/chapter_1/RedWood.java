package com.chapter_1;

import java.util.ArrayList;
import java.util.List;

import com.sun.xml.internal.messaging.saaj.soap.impl.TreeException;

public class RedWood extends Tree {

	static final short t = 0;
	static int ouch = 7;
	RedWood r = null;

	public RedWood() {
		r = this;
	}

	public static void main(String[] args) {
		// new RedWood().go((RedWood) new Tree(), new RedWood());
		System.out.println(t);

		ouch();

		int i1 = Integer.MAX_VALUE;
		System.out.println(i1);
		byte b1 = (byte) i1;
		System.out.println(b1);
		byte b2 = (byte) (int) (10.3 * 1_0);
		System.out.println(b2);

		System.out.println("------------------");
		int x = 14;
		int a = 5;
		double d = x / a;
		System.out.println(d);

		Tree t1 = new Tree();
		if (t1 instanceof Tree) {
			System.out.println("Yes it is");
		}

		if (t1 instanceof Grownable) {
			System.out.println("Yes it implements Grownable");
		}

		if (5 < 2 || (5 > 2))
			System.out.println("Hola");
		;

		String test = "hola";
		String test1 = "hola rafO";

		System.out.println(test == test1);
		System.out.println(test1.indexOf('\u004F', 0));
		System.out.println(test1.charAt(1));
		System.out.println(test1.replace("o", "a"));
		System.out.println(test1.concat(" TEST"));
		System.out.println(test1.substring(3, 6));
		System.out.print(test1.concat(" TEST ").trim());
		System.out.println("_1_");
		System.out.println(test1.length());

		String[] arrayUno = { "", "" };
		System.out.println(arrayUno.length);

		StringBuilder sb1 = new StringBuilder("test sb");
		System.out.println(sb1.toString().equals("test sb "));
		System.out.println(sb1.append(true));
		System.out.println(sb1.append(
				new char[] { ' ', 'a', 'r', 'r', 'a', 'y' }, 0, 3));
		System.out.println(sb1.length());
		System.out.println(sb1.insert(14, " hola", 0, 5));
		System.out.println(sb1.length());
		System.out.println(sb1.substring(3, 19));
		System.out.println(sb1);
		System.out.println(sb1.deleteCharAt(18));
		System.out.println(sb1.delete(6, 8));

		String[] arrayDos = new String[10];
		arrayDos[arrayDos.length - 2] = "hola";
		arrayDos[arrayDos.length - 1] = "holaFIN";
		String[] arrayTres = new String[0];
		arrayTres = arrayDos;
		for (String string : arrayTres) {
			System.out.println(string);
		}
		String[] arrayCuatro = new String[10];
		System.arraycopy(arrayTres, 8, arrayCuatro, 0, 2);
		System.out.println("-------------------------");
		for (String string : arrayCuatro) {
			System.out.println(string);
		}

		List<String> listaString = new ArrayList<String>(128);
		System.out.println(listaString.size());
		listaString.add(0, "hola1");
		listaString.add("hola5");
		listaString.add(1, "hola2");
		listaString.add(2, "hola3");
		// listaString.clear();
		listaString.add(3, "hola4");
		System.out.println(listaString.contains(new String("hola5")));
		System.out.println(listaString.get(2));
		System.out.println(listaString.indexOf("hola5"));
		listaString.remove(4);
		listaString.remove("hola4");
		System.out.println(listaString.size());
		System.out.println("--------");
		for (String string : listaString) {
			System.out.println(string);
		}

		String s = new String("Red1");
		System.out.println(s.substring(0, 3));

		int[] ax = new int[10];

		for (int z = 0, i12 = 0; z < 3; z++) {
			System.out.println(z);
		}

		int xx = 7;

		switch (x) {

		default:{
			System.out.println("default");
			break;}
		case 7:
			System.out.println("7 entry");

		case 3:
			break;
		}
	}

	void go(Tree t, RedWood r) {
	}

	static void ouch(/* int ouch */) {
		for (int ouch = 0; ouch < 6; ouch++)
			;
		System.out.println(ouch);
	}

}

class Tree implements Grownable {
}

interface Grownable {

}
