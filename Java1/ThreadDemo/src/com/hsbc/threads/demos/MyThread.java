package com.hsbc.threads.demos;

public class MyThread extends Thread {

	@Override
	public void run() {
		for(int i=1;i<500;i++) {
			Thread.yield();
		
			System.out.println(Thread.currentThread().getName()+" "+(i*5));
		}
	}
	

}
