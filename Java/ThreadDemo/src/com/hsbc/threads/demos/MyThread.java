package com.hsbc.threads.demos;

public class MyThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int id=1;id<=500;id++) {
			System.out.println(Thread.currentThread().getName()+" "+(id*5));
			
		}
	}
	
	

}
