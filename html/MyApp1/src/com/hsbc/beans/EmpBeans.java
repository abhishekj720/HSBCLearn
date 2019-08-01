package com.hsbc.beans;

public class EmpBeans {
	private String name;
	private double sal;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	public double getPf(){
		return sal*0.12;
	}
	
	public double getTax() {
		double tax=0;
		if(sal>25000)
			tax=sal*0.1;
		return tax;
	}
	public double getHra(){
		return sal*0.4;
	}
	
	public double getNetSal() {
		return sal+getHra()-(getTax()+getPf());
	}

}