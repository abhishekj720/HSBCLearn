package com.hsbc.runnable.demos;

public class RunnableClient {

	public static void main(String[] args) {
		MyRunnable r1 = new MyRunnable();
		Thread t1 = new Thread(r1);
		t1.setName("tom");
		Thread t2 = new Thread(r1);
		t2.setName("mary");
		t1.start();
		t2.start();
		System.out.println("Main ends");
	}

}
