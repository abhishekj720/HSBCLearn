package com.hsbc.bytes.demo;

import java.io.Serializable;

public class Emp implements Serializable{

	private int empId;
	private String empName;
	private transient String desig;
	private double sal;
	
	public Emp()
	{
		
	}
	
	public Emp(int empId, String empName, String desig,double sal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.desig = desig;
		this.sal=sal;
	}
	@Override
	public String toString() {
		return empId+" "+empName+" "+desig+" "+sal;
	}

	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public String getDesig() {
		return desig;
	}
	
}
