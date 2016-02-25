package com.ch11.MultithreadedProgramming;

public class SynchAlternativeVersion {

	public static void main(String... args) {
		CallmeAlternativeVersion callme = new CallmeAlternativeVersion();
		CallerAlternativeVersion obj1 = new CallerAlternativeVersion(callme, "one");
		CallerAlternativeVersion obj2 = new CallerAlternativeVersion(callme, "two");
		CallerAlternativeVersion obj3 = new CallerAlternativeVersion(callme, "three");
		
		try {
			obj1.thread.join();
			obj2.thread.join();
			obj3.thread.join();
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
		System.out.println("END");
	}

}
