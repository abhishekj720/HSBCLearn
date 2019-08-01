package com.hsbc.entity;

import java.io.Serializable;

import com.hsbc.entity.Emp;

public class Emp implements Serializable, Comparable<Emp> {

	private static final long serialVersionUID =7595185338358079224L;
	private int empId;
	private String empName;
	private double empSal;

	public Emp() {

	}

	@Override
	public boolean equals(Object obj) {
		Emp emp = (Emp) obj;
		if (this == emp)
			return true;
		if (this.empId == emp.empId)
			return true;
		return false;
	}

	@Override
	public int hashCode() {

		return empId;
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
		return empId + " " + empName + " " + empSal;
	}

	@Override
	public int compareTo(Emp emp) {

		Integer eid1 = this.empId;
		return eid1.compareTo(emp.empId);
	}

}