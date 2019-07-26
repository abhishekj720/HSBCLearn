package com.hsbc.inter.demos;

public class QueueClient {

	public static void main(String[] args) {
		MyQueue q = new MyQueue();
		ProducerThread t1 = new ProducerThread(q);
		t1.setName("Producer");
		ConsumerThread t2= new ConsumerThread(q);
		t2.setName("Consumer");
		
		t1.start();
		t2.start();
	}

}
