package com.hsbc.runnable.demos;

public class RunnableClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable r1 = new MyRunnable();
		Thread t1 = new Thread(r1);
		t1.setName("tom");
		Thread t2 = new Thread(r1);
		t2.setName("tomadasdsada");
		t1.start();
		t2.start();
		
		System.out.println("main thread ends");

	}

}
