package com.hsbc.entity;

import java.io.Serializable;

public class Emp implements Serializable,Comparable<Emp>{
	
	private int empId;
	private String empName;
	private double empSal ;
	
	public Emp() {
		
	}
	
	public Emp(int empId, String empName, double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}


	public int getEmpId() {
		return empId;
	}


	public String getEmpName() {
		return empName;
	}


	public double getEmpSal() {
		return empSal;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return empId+" "+empName+" "+empSal;
	}


	public int compareTo(Emp emp) {
		// TODO Auto-generated method stub
		Integer eid1 = this.empId;
		return eid1.compareTo(emp.empId);
	}
	
	
	
	
	
	
}
