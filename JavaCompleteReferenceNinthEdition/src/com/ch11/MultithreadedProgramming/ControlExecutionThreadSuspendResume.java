package com.ch11.MultithreadedProgramming;

public class ControlExecutionThreadSuspendResume {

	public static void main(String[] args) {
		ControlExecutionThread ob1 = new ControlExecutionThread("One");
		ControlExecutionThread ob2 = new ControlExecutionThread("Two");

		try {
			Thread.sleep(1000);
			ob1.mySuspend();
			System.out.println("Suspending thread One");
			Thread.sleep(1000);
			ob1.myResume();
			System.out.println("Resuming thread One");
			ob2.mySuspend();
			System.out.println("Suspending thread Two");
			Thread.sleep(1000);
			ob2.myResume();
			System.out.println("Resuming thread Two");
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}

		try {
			System.out.println("Waiting for threads to finish.");
			ob1.t.join();
			ob2.t.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		System.out.println("Main thread exiting.");

	}
}
