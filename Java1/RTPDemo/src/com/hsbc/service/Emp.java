package com.hsbc.service;

public abstract class Emp {
	
	private int empId;
	private String empName;
	private double sal;
	
	public Emp(int empId, String empName, double sal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
	}
	
	public void display()
	{
		System.out.printf("%10s%10d%20s%10.2f", getClass().getSimpleName() ,empId, empName, sal);
	}

	public double getSal() {
		return sal;
	}

	public abstract double calcSalary();
	
	
}
