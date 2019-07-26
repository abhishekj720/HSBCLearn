package com.hsbc.service;

public abstract class HCart {
	
	private double pid;
	private String pname;
	private int price;
	
	public HCart(double pid, String pname, int price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	
	public abstract String calcRange();

	public int getPrice() {
		return price;
	}

	public double getPid() {
		return pid;
	}

	public String getPname() {
		return pname;
	}
	
	
	
}
