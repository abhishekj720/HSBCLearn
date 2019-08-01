package com.hsbc.service;

public class Fashion extends Product{
	
	public Fashion(int pid, String pname, double price) {
		super(pid, pname, price);
	}

	@Override
	public String range() {
		if(getPrice()<1000)
			return("Cheap");
		else if(getPrice()>1000 && getPrice()<5000)
			return("medium");
		else
			return("Expensive");
	}

}
