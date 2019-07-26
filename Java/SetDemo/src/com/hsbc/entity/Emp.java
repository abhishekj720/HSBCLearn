//entity contains only getter and setter ,no data
package com.hsbc.entity;

public class Emp implements Comparable<Emp>{
	
	private int empId;
	private String empName;
	private double empSal ;
	
	
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


	@Override
	public boolean equals(Object obj) {
		Emp emp = (Emp)obj;
		if(this == emp) return true;
		if(this.empId == emp.empId) return true;
		return false;
	}
	
	
	
	
	
	
}
