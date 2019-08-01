package com.hsbc.service;

public class Emp {
	private byte age;
	private String name;
	private double sal;
	public double pf;
	public double da;
	
	public Emp(int age, String name, double sal) throws Exception {
		super();
		if(age<20||age>50)
			throw new Exception("Age must be between 20 and 50");
		if(sal<5000)
			throw new Exception("Salary must be min 5000");
		if(!name.matches("[a-zA-Z]{3,15}"))
			throw new Exception("Name must containg 3-15 alphabets");
		this.age = (byte)age;
		this.name = name;
		this.sal = sal;
		this.pf=calcPf();
		this.da=calcDa();
	}
	
	private double calcPf()
	{
		return this.sal*0.12;
	}
	private double calcDa()
	{
		return this.sal*0.4;
	}
	public double calcSalary()
	{
		return this.sal+this.da-this.pf;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public double getSal() {
		return sal;
	}

	public double getPf() {
		return pf;
	}

	public double getDa() {
		return da;
	}
	
}
