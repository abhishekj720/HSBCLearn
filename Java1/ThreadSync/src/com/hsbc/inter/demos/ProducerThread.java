package com.hsbc.inter.demos;


public class ProducerThread extends Thread {
	private MyQueue q;
	
	public ProducerThread(MyQueue q) {
		super();
		this.q=q;
	}
	public void run() {
		for(int i=1;i<=5;i++)
			q.put();
	}

}
