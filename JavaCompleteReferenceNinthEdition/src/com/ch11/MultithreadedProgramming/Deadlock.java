package com.ch11.MultithreadedProgramming;

public class Deadlock implements Runnable {

	DeadlockA a = new DeadlockA();
	DeadlockB b = new DeadlockB();
	
	public Deadlock() {
		super();
		Thread.currentThread().setName("Main Thread");
		Thread t = new Thread(this, "RacingThread");
		t.start();
		
		a.foo(b); // get lock on a in this thread.
		System.out.println("Back in main thread");
	}

	@Override
	public void run() {
		b.bar(a); // get lock on b in other thread.
		System.out.println("Back in other thread");
	}

	public static void main(String[] args) {
		new Deadlock();
	}
}
