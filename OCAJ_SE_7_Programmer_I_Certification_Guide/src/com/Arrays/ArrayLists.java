package com.Arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ArrayLists {

	public boolean equals(Object obj){
		return false;
	}
	
	public static void main(String[] args) {

		ArrayList<String> arrayString = new ArrayList<>();

		arrayString.add("uno");
		arrayString.add("dos");
		arrayString.add("cuatro");
		arrayString.add(2, "tres");

		for (String string : arrayString)
			System.out.println(string);

		System.out.println();
		ListIterator<String> listIterator = arrayString.listIterator();
		while (listIterator.hasNext()) {
			String string = listIterator.next();
			if (string.equalsIgnoreCase("tres"))
				listIterator.set("tres y medio");
		}

		arrayString.set(3, "cuatro y medio");

		for (String string : arrayString)
			System.out.println(string);

		System.out.println();

		ArrayList<StringBuilder> arrayStringBuilders = new ArrayList<StringBuilder>();

		arrayStringBuilders.add(new StringBuilder("uno sb"));
		arrayStringBuilders.add(new StringBuilder("dos sb"));
		arrayStringBuilders.add(new StringBuilder("tres sb"));
		arrayStringBuilders.add(new StringBuilder("cuatro sb"));

		StringBuilder stringBuilderDelete = null;

		for (StringBuilder stringBuilder : arrayStringBuilders)
			if (stringBuilder.toString().equalsIgnoreCase("uno sb")) {
				stringBuilder.append(" modificado");
				stringBuilderDelete = stringBuilder;
			}

		for (StringBuilder stringBuilder : arrayStringBuilders)
			System.out.println(stringBuilder);

		System.out.println();

		arrayStringBuilders.remove(3);
		arrayStringBuilders.remove(stringBuilderDelete);

		for (StringBuilder stringBuilder : arrayStringBuilders)
			System.out.println(stringBuilder);

		System.out.println();

		ArrayList<Persona> arrayPersonas = new ArrayList<Persona>();
		arrayPersonas.add(new Persona("Rafael"));
		arrayPersonas.add(new Persona("Erick"));
		arrayPersonas.add(new Persona("Jose"));
		arrayPersonas.add(new Persona("Erick"));

		System.out.println(arrayPersonas.get(0).equals(new Persona("Rafael")));
		System.out.println();

		for (Persona persona : arrayPersonas)
			System.out.println(persona.name);
		
		System.out.println();
		
		//arrayPersonas.remove(new Persona("Erick"));
		
		for (Iterator iterator = arrayPersonas.iterator(); iterator.hasNext();) {
			Persona persona = (Persona) iterator.next();
			if(persona.equals(new Persona("Erick")))iterator.remove();
		}

		for (Persona persona : arrayPersonas)
			System.out.println(persona.name);

		List<Persona> listaPersonas = new Vector<Persona>();
		listaPersonas.add(new Persona("Elizabeth"));
		listaPersonas.add(new Persona("Amanda"));
		listaPersonas.add(new Persona("Liliana"));
		
		arrayPersonas.addAll(listaPersonas);
		
		System.out.println();
		
		for (Persona persona : arrayPersonas)
			System.out.println(persona.name);
		
		System.out.println();
		arrayPersonas.remove(new Persona("Liliana"));
		
		for (Persona persona : arrayPersonas) {
			if(persona.equals(new Persona("Elizabeth")))persona.name="Eli";
		}
		
		for (Persona persona : arrayPersonas)
			System.out.println(persona.name);
		
		Collection<Persona> colecionPersonas = new ArrayList<Persona>();
		colecionPersonas.add(new Persona("Erick"));
		
		arrayPersonas.addAll(1, colecionPersonas);
		colecionPersonas.add(new Persona("Liliana"));
		
		System.out.println();
		for (Persona persona : arrayPersonas)
			System.out.println(persona.name);
		System.out.println("\nLISTA CLONADA");
		arrayPersonas.get(0).name="Rafael Modificado en clonada";
		
		ArrayList<Persona> listaPersonasClonada = (ArrayList<Persona>)arrayPersonas.clone();
		for (Persona persona : listaPersonasClonada) {
			System.out.println(persona.name);
		}
		
		System.out.println("\nContains Amanda: "+ arrayPersonas.contains(new Persona("Amanda")));
		System.out.println("\nIndex of Eli: "+arrayPersonas.indexOf(new Persona("Eli")));
		System.out.println("\nLast Index of Eli: "+arrayPersonas.lastIndexOf(new Persona("Eli")));
		
		
		
		System.out.println("\nCLEAR "+arrayPersonas.size()+"\n");
		arrayPersonas.clear();
		
		for (Persona persona : arrayPersonas)
			System.out.println(persona.name);
		
		System.out.println("AFTER CLEAR "+arrayPersonas.size()+"\n");
		
		System.out.println("LISTA CLONADA");
		for (Persona persona : listaPersonasClonada) {
			System.out.println(persona.name);
		}
		Object[] personas = listaPersonasClonada.toArray();
		System.out.println("\nARRAY PERSONAS");
		listaPersonasClonada.get(1).name = listaPersonasClonada.get(1).name+" modificado en array";
		for (int i = 0; i < personas.length; i++) {
			System.out.println(((Persona)personas[i]).name);
		}
		
		System.out.println("\nARRAY COPIADO");
		ArrayList<Persona> listaCopiada = listaPersonasClonada;
		listaPersonasClonada.get(3).name = listaPersonasClonada.get(3).name+" modificada en copia";
		for (Persona persona : listaCopiada) {
			System.out.println(persona.name);
		}
		
		
		String[] aaa = {"a","b"};
		
		for(String a : aaa){
		System.out.println(a);	
		}
		

		int[][] array1 = {{1, 2, 3}, {}, {1, 2,3, 4, 5}};
		
		StringBuilder ejg = new StringBuilder(10 + 2 + "SUN" + 4 + 5);
		ejg.append(ejg.delete(3, 6));
		System.out.println(ejg);
		
		ejg.subSequence(2,4);
		ejg.deleteCharAt(3);
		System.out.println(ejg);
		
		ArrayList<Integer> list = new ArrayList<>(1);
		list.add(100);
		list.add(200);
		System.out.println(list.get(list.size()-1));
		
	}

}

class Persona {
	String name;

	public Persona(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Persona) {
			Persona p = (Persona) obj;
			return p.name.equals(this.name);
		} else {
			return false;
		}
	}
}
