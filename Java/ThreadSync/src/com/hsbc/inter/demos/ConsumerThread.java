package com.hsbc.inter.demos;

public class ConsumerThread extends Thread{

	private MyQueue que;
	
	public ConsumerThread(MyQueue que) {
		super();
		this.que = que ;
	}
	
	
}
