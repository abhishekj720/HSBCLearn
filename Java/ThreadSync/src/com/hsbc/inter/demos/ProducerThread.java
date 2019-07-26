package com.hsbc.inter.demos;

public class ProducerThread extends Thread {
	
	private MyQueue que;
	
	public ProducerThread(MyQueue que) {
		super();
		this.que = que;
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			que.put();
		}
	}
}
