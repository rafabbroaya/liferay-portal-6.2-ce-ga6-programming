package com.ch11.MultithreadedProgramming;

public class DemoJoin {

	public static void main(String[] args) {
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		System.out.println(Thread.currentThread());
		NewThread thread1 = new NewThread("One");
		NewThread thread2 = new NewThread("Two");
		NewThread thread3 = new NewThread("Three");
		
		System.out.println("Thread1 is alive: "+thread1.t.isAlive());
		System.out.println("Thread2 is alive: "+thread2.t.isAlive());
		System.out.println("Thread3 is alive: "+thread3.t.isAlive());
		
		//wait for threads to finish
		
		try {
			System.out.println("Waiting for threads to finish");
			thread1.t.join();
			thread2.t.join();
			thread3.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Thread1 is alive: "+thread1.t.isAlive());
		System.out.println("Thread2 is alive: "+thread2.t.isAlive());
		System.out.println("Thread3 is alive: "+thread3.t.isAlive());
		
		System.out.println("Main thread exiting");
	}
}
