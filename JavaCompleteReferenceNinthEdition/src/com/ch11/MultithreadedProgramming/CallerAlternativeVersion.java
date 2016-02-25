package com.ch11.MultithreadedProgramming;

public class CallerAlternativeVersion implements Runnable{

	CallmeAlternativeVersion callme;
	String msg;
	Thread thread;
	
	public CallerAlternativeVersion(CallmeAlternativeVersion callme, String msg) {
		super();
		this.callme = callme;
		this.msg = msg;
		thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		synchronized (this.callme) {
			this.callme.call(this.msg);
		}
	}
}
