package com.hsbc.control.demos;

public class AVGThread extends Thread {

	@Override
	public void run() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(MyUtil.data/1000);
		
	}
	
	
}
