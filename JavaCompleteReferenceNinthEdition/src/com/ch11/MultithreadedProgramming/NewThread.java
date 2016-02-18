package com.ch11.MultithreadedProgramming;

public class NewThread implements Runnable{

	Thread t;
	String name;
	
	public NewThread(String threadName) {
		super();
		name = threadName;
		t = new Thread(this, name);
		System.out.println("Child thread: " + t);
		t.start();
	}


	@Override
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(this.name + ":" + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println(this.name + ": interrupted");
		}
		System.out.println("Exiting "+ name +" thread");
	}

}
