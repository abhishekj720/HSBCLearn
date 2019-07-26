package com.hsbc.service;

public class Contract extends Emp {
	
	private int days;

	public Contract(int empid, String empname, double sal, int days) {
		super(empid, empname, sal);
		this.days = days;
	}

	@Override
	public double calcSalary() {
		// TODO Auto-generated method stub
		return this.getSal()*days;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.printf("%10s %10s %10d %10.2f\n","--","--",days,calcSalary());
	}
	
	


	
	
}
