package com.hsbc.service;

public class Interest {
	//3states and 2 behavior
	
	public double amt;
	public int years;
	public double rate;
	
	
	public double getAmt() {
		
		return amt;
	}

	public void setAmt(double amt) throws Exception {
		if(amt <= 0) {
			throw new Exception("Amount must be greater than zero");
		}
		this.amt = amt;
	}

	public int getYears() {
		
		return years;
	}

	public void setYears(int years) throws Exception {
		if(years <= 0) {
			throw new Exception("Years must be greater than zero");
		}
		this.years = years;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) throws Exception {
		if(rate <= 0) {
			throw new Exception("Rate must be greater than zero");
		}
		this.rate = rate;
	}

	public double calcSimple() {
		double si = amt*years*rate/100;
		return si;
	}
	
	public double calcCompound() {
		return amt*Math.pow(1 + rate/100, years) - amt;
	}
}
