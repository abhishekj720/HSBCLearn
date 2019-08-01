package com.hsbc.inter.demos;

public class ConsumerThread extends Thread {
	
	private MyQueue q=new MyQueue();
	
	public ConsumerThread(MyQueue q) {
		super();
		this.q=q;
	}
	
	public void run() {
		for(int i=1;i<=5;i++)
			q.get();
	}

}
