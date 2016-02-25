package com.ch11.MultithreadedProgramming;

public class CallmeAlternativeVersion {

	public void call (String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("Call interrupted");
		}
		System.out.println("]");
	}
}
