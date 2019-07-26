package com.hsbc.join.demos;

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {
		
		AVGThread t1 = new AVGThread();
		SumThread t2 = new SumThread();
		
		t2.start();
		t2.join();
		t1.start();
	}

}
