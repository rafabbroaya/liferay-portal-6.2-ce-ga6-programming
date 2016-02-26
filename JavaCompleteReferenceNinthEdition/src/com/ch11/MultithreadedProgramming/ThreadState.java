package com.ch11.MultithreadedProgramming;

/**
 * Only worth for debugging
 * @author rsanchez
 *
 */
public class ThreadState {
	public static void main(String[] args) {
		boolean end = false;
		Thread mainThread = Thread.currentThread();
		synchronized (mainThread) {
			while (!end) {
				try {
					System.out.println(mainThread.getState());
					mainThread.wait(2000);
					System.out.println(mainThread.getState());
					end = true;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
