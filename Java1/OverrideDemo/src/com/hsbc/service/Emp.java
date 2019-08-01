package com.hsbc.service;

public class Emp implements Cloneable {
		
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	private int eid;
	private String ename;
	
	public Emp(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	@Override
	public String toString() {
		return eid + " " + ename;
	}
	@Override
	public boolean equals(Object obj) {
		Emp emp = (Emp)obj;
		if(this==emp)
			return true;
		if(this.eid==emp.eid && this.ename.equals(emp.ename))
			return true;
		return false;
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println(eid+"the instance is garbage collected");
	}
 
	
	

}
