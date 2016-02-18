package com.methods.encapsulation;

public class ScopeOfVariables {

	public double getAverage() {
		// LOCAL VARIABLES
		double avg = 0;
		if (avg > 10) {
			//LOCAL VARIABLE IF BLOCK
			double localIfBlock = 0;
			avg = localIfBlock;
		} else {
			
		}
		//LOCAL VARIABLE LOOP
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		return avg;
	}

	public static void main(String[] args) {
		/*ScopeOfVariables scopeOfVariables = new ScopeOfVariables();
		System.out.println(scopeOfVariables.getAverage());*/
		int contador = 0;
		for (int i = 1; i <= 100; i++) {
			contador+=i;
		}
		System.out.println(contador);
	}
}
