package com.hsbc.sync.demos;

public class TomThread extends Thread {

	private Account acc;
	public TomThread(Account acc) {
		super();
		this.acc=acc;
	}
	@Override
	public void run() {
		acc.doTransaction();
	}
}
