package com.hsbc.service;

public class Computer extends HCart {
	
	

	public Computer(double pid, String pname, int price) {
		super(pid, pname, price);
		
	}
	
	public String calcRange() {
		
		if( getPrice() < 20000)
		{
			return  "cheap";
		}
		else if(getPrice() < 40000)
			return "medium";
		else
			return "Very Expensive";	
		
	}

}
