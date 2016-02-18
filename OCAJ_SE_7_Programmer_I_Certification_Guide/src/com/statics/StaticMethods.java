package com.statics;

import com.access.Default;
import com.non_access.Interface;

public class StaticMethods extends Default implements Interface{
	
	public static int MAX_AGE = 100;
	public static int MIN_AGE = getMinAge();
	public int age = getMinAge();
	
	public static int getMinAge() {
		return 10;
	}
	
	public static int getMaxAge() {
		return MAX_AGE;
	}
	
	public int returnAge(){
		instanceVarible = 10;
		test = 12;
		return MAX_AGE;
	}
	
	public static void main(String[] args) {
		StaticMethods.MAX_AGE = 200;
		System.out.println(StaticMethods.getMaxAge());
		StaticsMethods.    doSomething();
	}

	@Override
	public void printInterface() {
		// TODO Auto-generated method stub
		
	}
	
	int instanceVarible;

}

class dos {
	

}
