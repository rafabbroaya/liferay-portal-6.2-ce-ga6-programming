package com.ch11.MultithreadedProgramming;

public class Caller implements Runnable{
	
	Callme target;
	String msg;
	Thread thread;

	public Caller(Callme target, String msg) {
		super();
		this.target = target;
		this.msg = msg;
		
		thread = new Thread(this, msg); 
		thread.start();
	}

	@Override
	public void run() {
		target.call(this.msg);
	}

	
}
