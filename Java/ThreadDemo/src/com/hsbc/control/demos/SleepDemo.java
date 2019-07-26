package com.hsbc.control.demos;

public class SleepDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("I am in main");

	}

}
