package com.ch11.MultithreadedProgramming;

public class ControlExecutionThread implements Runnable {

	String name;
	Thread t;
	boolean suspendFlag;

	public ControlExecutionThread(String threadName) {
		this.name = threadName;
		t = new Thread(this, this.name);
		System.out.println("New Thread: " + this.name);
		this.suspendFlag = false;
		t.start();

	}

	synchronized void mySuspend() {
		this.suspendFlag = true;
	}

	synchronized void myResume() {
		this.suspendFlag = false;
		notify();
	}

	@Override
	public void run() {
		try {
			for (int i = 15; i > 0; i--) {
				System.out.println(this.name + ": " + i);
				Thread.sleep(200);
				synchronized (this) {
					while (this.suspendFlag) {
						this.wait();
					}
				}

			}
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
		System.out.println(this.name + " exiting");
	}

}
