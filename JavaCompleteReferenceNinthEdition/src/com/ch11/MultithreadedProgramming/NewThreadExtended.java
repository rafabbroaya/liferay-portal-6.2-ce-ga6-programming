package com.ch11.MultithreadedProgramming;

public class NewThreadExtended extends Thread {

	public NewThreadExtended() {
		super("Demo Thread");
		System.out.println("Chield Thread: " + this);
		start();
	}

	@Override
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Child Thread" + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Child interrupted");
		}
		System.out.println("Exiting Child thread");
	}
}
