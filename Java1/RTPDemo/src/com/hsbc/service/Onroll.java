package com.hsbc.service;

public class Onroll extends Emp {

	private double pf;
	private double da;
	
	
	public Onroll(int empId, String empName, double sal) {
		super(empId, empName, sal);
		calcPf();
		calcDa();
	}

	private void calcPf() {
		this.pf = this.getSal()*HConstants.PF_PERCENT;
	}
	
	private void calcDa() {
		this.da = this.getSal()*HConstants.DA_PERCENT;
	}
	
	@Override
	public double calcSalary() {
		return getSal()+da-pf;
	}

	@Override
	public void display() {
		super.display();
		System.out.printf("%10.2f%10.2f%10s%10.2f\n",da,pf,"--",calcSalary());
	}
	
	
}
