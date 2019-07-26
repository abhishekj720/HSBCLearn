package com.hsbc.service;

public class Fashion extends HCart {

	public Fashion(double pid, String pname, int price) {
		super(pid, pname, price);
		
	}
	
	
	public String calcRange() {
		
		if( getPrice() < 1000)
		{
			return  "cheap";
		}
		else if(getPrice() < 5000)
			return "medium";
		else
			return "Very Expensive";	
		
	}
	
	
	

}
