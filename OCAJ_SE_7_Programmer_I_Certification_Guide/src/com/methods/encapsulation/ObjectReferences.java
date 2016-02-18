package com.methods.encapsulation;

public class ObjectReferences {
	private String name;

	public ObjectReferences(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void printObjects(ObjectReferences objectReferences1,
			ObjectReferences objectReferences2) {
		System.out.println(objectReferences1.getName() + ":"
				+ objectReferences2.getName());
	}

	public static void swap(ObjectReferences objectReferences1,
			ObjectReferences objectReferences2) {
		ObjectReferences temp = objectReferences1;
		objectReferences1 = objectReferences2;
		objectReferences2 = temp;
		ObjectReferences.printObjects(objectReferences1, objectReferences2);
	}
	
	public static void changeObjectState(ObjectReferences objectReferences1,
			ObjectReferences objectReferences2) {
		objectReferences1.setName(objectReferences2.getName());
		objectReferences2.setName(objectReferences1.getName());
	}

	public static void main(String[] args) {
		ObjectReferences objectReferences1 = new ObjectReferences("Rafael");
		ObjectReferences objectReferences2 = new ObjectReferences("Erick");
		printObjects(objectReferences1, objectReferences2);
		swap(objectReferences1, objectReferences2);
		printObjects(objectReferences1, objectReferences2);
		changeObjectState(objectReferences1, objectReferences2);
		printObjects(objectReferences1, objectReferences2);
	}
}
