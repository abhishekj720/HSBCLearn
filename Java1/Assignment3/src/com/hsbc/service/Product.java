package com.hsbc.service;

public abstract class Product {
	
	private int pid;
	private String pname;
	private double price;
	
	public Product(int pid, String pname, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}	
		
	public int getPid() {
		return pid;
	}

	public String getPname() {
		return pname;
	}

	public double getPrice() {
		return price;
	}

	public abstract String range();
	

}
