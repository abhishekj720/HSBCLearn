package com.hsbc.service;

public class Nokia1100 {

	public double price;

	public Nokia1100(double price) {
		super();
		this.price = price;
		System.out.println("Nokia 1100 constructor");
	}
	
	public void doConverse() {
		System.out.println("do converse -----3g");
	}
	
	public void sendSms() {
		System.out.println("send sms");
	}
	
	
}
