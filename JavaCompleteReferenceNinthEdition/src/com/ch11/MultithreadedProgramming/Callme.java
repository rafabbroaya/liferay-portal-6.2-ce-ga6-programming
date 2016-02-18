package com.ch11.MultithreadedProgramming;

public class Callme {

	public synchronized void call (String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Call interrupted");
		}
		System.out.println("]");
	}
}
