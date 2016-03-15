package com.mkyong.common;

/**
 * Spring bean
 * @author rafael
 *
 */
public class HelloWorld {

	private String name;

	public void printHello() {
		System.out.println("Hello ! " + name);
	}

	public void setName(String name) {
		this.name = name;
	}

}
