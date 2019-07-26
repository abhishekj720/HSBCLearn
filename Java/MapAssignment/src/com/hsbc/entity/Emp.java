package com.hsbc.entity;

import java.time.LocalDate;

public class Emp implements Comparable<Emp>{

	private int empId;
	private String empName;
	private double empSal;
	private LocalDate doj;
	private String dept;
	
	

	public Emp(int empId, String empName, double empSal, LocalDate doj, String dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.doj = doj;
		this.dept = dept;
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

	
	public LocalDate getDoj() {
		return doj;
	}

	public String getDept() {
		return dept;
	}

	
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		
		return empId + " " + empName + " " + empSal + " " + doj + " "  + dept;
	}

	@Override
	public int compareTo(Emp emp) {
		Integer eid1 = this.empId;
		return eid1.compareTo(emp.empId);
	}

	@Override
	public int hashCode() {
	
		return empId;
	}

	@Override
	public boolean equals(Object obj) {
		Emp emp = (Emp)obj;
		if(this == emp) return true;
		if(this.empId == emp.empId) return true;
		return false;
	}
	
	
	
}
