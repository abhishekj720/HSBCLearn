package com.hsbc.threads.demos;

public class ThreadClient {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread t1=new MyThread();
		t1.setName("ram");
		t1.setPriority(Thread.MAX_PRIORITY);
		
		MyThread t2=new MyThread();
		t2.setName("sam");
		t2.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();

		t2.start();

		Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
		for(int i=1;i<500;i++)
			System.out.println(Thread.currentThread().getName()+" "+(i*5));
	}

}
