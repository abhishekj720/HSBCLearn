package com.hsbc.control.demos;

public class SleepDemo {

	public static void main(String[] args) {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("I am in main");
	}

}
