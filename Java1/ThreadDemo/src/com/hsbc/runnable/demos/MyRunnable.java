package com.hsbc.runnable.demos;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<500;i++)
			System.out.println(Thread.currentThread().getName()+" "+(i*5));
		
	}

	
}
