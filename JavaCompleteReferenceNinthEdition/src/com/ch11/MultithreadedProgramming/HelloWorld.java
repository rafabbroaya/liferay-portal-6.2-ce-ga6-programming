package com.ch11.MultithreadedProgramming;

public class HelloWorld implements Runnable{

	public Thread thread;

	public static void main(String[] args) throws InterruptedException {
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.thread.start();

	}

	public HelloWorld() {
		thread = new Thread(this);
	}

	@Override
	public void run() {
		while (true) {
			String msj = "Hello world, I'm a thread!!!";
			for (int i = 0; i < msj.length(); i++) {
				try {
					System.out.print(msj.charAt(i));
					Thread.sleep(150);
				} catch (InterruptedException e) {
					System.out.println("Interrupted");
				}
			}
			System.out.println();
		}

	}
}
