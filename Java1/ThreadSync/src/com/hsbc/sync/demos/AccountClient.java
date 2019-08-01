package com.hsbc.sync.demos;

public class AccountClient {

	public static void main(String[] args) {
		Account acc = new Account();
		TomThread t1=new TomThread(acc);
		t1.setName("Tom");
		JackThread t2=new JackThread(acc);
		t2.setName("Jack");
		t2.start();
		t1.start();

	}

}
