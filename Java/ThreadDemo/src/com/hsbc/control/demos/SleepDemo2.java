package com.hsbc.control.demos;

public class SleepDemo2 extends Thread{

	public static void main(String [] args) {
		
		AVGThread t1 = new AVGThread();
		SumThread t2 = new SumThread();
		
		t1.start();
		t2.start();
	}
}
