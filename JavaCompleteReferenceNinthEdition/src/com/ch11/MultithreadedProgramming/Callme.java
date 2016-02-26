package com.ch11.MultithreadedProgramming;

public class Callme {

	public synchronized void call (String msg) {
		System.out.print("[" + msg);
		try {
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Call interrupted");
		}
		System.out.println("]");
	}
}
