package com.ch11.MultithreadedProgramming;

public class CommunicationConsumer implements Runnable{

	CommunicationQ q;
	
	public CommunicationConsumer(CommunicationQ q) {
		super();
		this.q = q;
		new Thread(this, "Consumer Thread").start();
	}

	@Override
	public void run() {
		while(true) {
			q.get();
		}
	}
	
}
