package com.hsbc.service;

public abstract class Emp {
	
	private int empid ;
	private String empname ;
	private double sal ;
	
	
	
	public Emp(int empid, String empname, double sal) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.sal = sal;
	}

	public void display() {
		System.out.printf("%10s%10d%20s%10.2f",getClass().getSimpleName(),empid,empname,sal);
	}
	
	public abstract double calcSalary();

	public double getSal() {
		return sal;
	}
	
	
}
