package com.ch11.MultithreadedProgramming;

public class CommunicationProducer implements Runnable {

	CommunicationQ q;
	
	
	
	public CommunicationProducer(CommunicationQ q) {
		super();
		this.q = q;
		new Thread(this, "Producer Thread").start();
	}



	@Override
	public void run() {
		int i = 0;
		while (true) {
			q.put(i++);
		}
		
	}

	
}
