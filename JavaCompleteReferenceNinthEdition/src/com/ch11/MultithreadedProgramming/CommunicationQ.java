package com.ch11.MultithreadedProgramming;

public class CommunicationQ {

	int n;
	boolean flag = false;

	synchronized int get() {
		while(!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Interrupted");
			}
		}
		System.out.println("Got: " + n);
		flag = false;
		notify();
		return n;
	}
	
	synchronized void put(int n) {
		while (flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Interrupted");
				e.printStackTrace();
			}
		}
		this.n = n;
		flag = true;
		System.out.println("Put: " + n);
		notify();
	}
}
