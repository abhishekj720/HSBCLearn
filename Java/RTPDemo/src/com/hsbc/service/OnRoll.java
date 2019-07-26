package com.hsbc.service;

public class OnRoll extends Emp{

	private double pf;
	private double da;
	
	
	
	public OnRoll(int empid, String empname, double sal) {
		super(empid, empname, sal);
		calcPF();
		calcOA();
		
	}


	private void calcPF() {
		this.pf =this.getSal()*HConstants.PF_PERCENT;
	}
	
	private void calcOA() {
		this.da = this.getSal()*HConstants.DA_PERCENT;
	}


	@Override
	public double calcSalary() {
		
		return getSal()+da-pf;
	}
	

	public void display() {
		super.display();
		System.out.printf("%10.2f%10.2f%10s%10.2f\n",da,pf,"--",calcSalary());
	}

}
