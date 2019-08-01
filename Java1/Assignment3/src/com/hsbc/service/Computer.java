package com.hsbc.service;

public class Computer extends Product {

	public Computer(int pid, String pname, double price) {
		super(pid, pname, price);
	}

	@Override
	public String range() {
		if(getPrice()<20000)
			return("Cheap");
		else if(getPrice()>20000 && getPrice()<40000)
			return("medium");
		else
			return("Expensive");
	}
	
	
	
	
	

}
