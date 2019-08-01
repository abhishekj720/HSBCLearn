package com.hsbc.sync.demos;

public class JackThread extends Thread {

	private Account acc;
	public JackThread(Account acc) {
		super();
		this.acc=acc;
	}
	public void run() {
		acc.getBalance();
	}
}
