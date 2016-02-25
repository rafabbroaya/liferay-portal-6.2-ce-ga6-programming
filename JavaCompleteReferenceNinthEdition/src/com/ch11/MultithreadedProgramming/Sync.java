package com.ch11.MultithreadedProgramming;

public class Sync {

	public static void main (String ...args) {
		Callme callme = new Callme();
		Caller caller1 = new Caller(callme, "one");
		Caller caller2 = new Caller(callme, "two");
		Caller caller3 = new Caller(callme, "three");
		
		try {
			caller1.thread.join();
			caller2.thread.join();
			caller3.thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End");
	}
}