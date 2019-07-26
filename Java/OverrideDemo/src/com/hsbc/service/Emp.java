package com.hsbc.service;

public class Emp implements Cloneable{
	
	private int eid ;
	private String ename;
	
	public Emp(int eid,String name)
	{
		super();
		this.eid = eid;
		this.ename = name;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return eid + " "+ ename;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		Emp emp =(Emp)obj;
		if(this == emp)
			return true;
		if(this.eid == emp.eid && this.ename.equals(emp.ename));
			return true;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}
