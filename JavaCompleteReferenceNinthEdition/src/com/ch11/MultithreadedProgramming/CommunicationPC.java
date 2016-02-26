package com.ch11.MultithreadedProgramming;

public class CommunicationPC {

	public static void main(String... args) {
		CommunicationQ q = new CommunicationQ();
		new CommunicationProducer(q);
		new CommunicationConsumer(q);
		
		System.out.println("Press Ctrl+C to stop.");
	}
}
