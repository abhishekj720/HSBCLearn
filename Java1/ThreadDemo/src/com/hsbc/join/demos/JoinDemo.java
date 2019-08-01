package com.hsbc.join.demos;

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {
		AvgThread t1=new AvgThread();
		SumThread t2=new SumThread();
		t2.start();
		t2.join();
		t1.start();

	}

}
