package com.hsbc.service;
import com.hsbc.util.HsbcUtil;
public class Interest {
	private double amt;
	private int years;
	private double rate;
	
	public double getAmt() {
		return amt;
	}
	public void setAmt(double amt) throws Exception {
		HsbcUtil.validateDataGreaterThanZero(amt, "Amount");
		this.amt = amt;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) throws Exception {
		HsbcUtil.validateDataGreaterThanZero(years, "Years");
		this.years = years;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) throws Exception {
		HsbcUtil.validateDataGreaterThanZero(rate, "rate");
		this.rate = rate;
	}
	public double calcSimple() {
		double si = amt*years*rate/HsbcUtil.HUNDRED;
		return si;
	}
	public double calcCompound()
	{
		double ci = amt * Math.pow((1+rate/HsbcUtil.HUNDRED), years)-amt;
		return ci;
	}
}
