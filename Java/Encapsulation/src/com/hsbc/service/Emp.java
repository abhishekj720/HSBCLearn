package com.hsbc.service;

public class Emp {

		public Emp(int age, double sal, String name) throws Exception {
		super();
		if(age <20 || age > 50) {
			throw new Exception("Age must be 20 and 50");
		}
		if(sal< 5000)
		{
			throw new Exception("Salary must be min 5000");
		}
		if(name.matches("[a-zA-Z]{3,15}")) {
			throw new Exception("name must contain 3 and less than 15 alphabets");
			
		}
		
		this.age = (byte)age;
		this.sal = sal;
		this.name = name;
		this.pf = this.sal*0.12;
		this.da = this.sal*0.4;
		
	}
		private byte age;
		private double sal;
		private String name;
		public double pf;
		public double da;
		
		
		public double calcPf() {
			return this.sal*0.12 ;
		}
		
		public double calcDA() {
			return this.sal*0.4;
		}
		
		public double calcSalary() {
			return this.sal + this.da - this.pf;
		}

		public int getAge() {
			return age;
		}

		public double getSal() {
			return sal;
		}

		public String getName() {
			return name;
		}

		public double getPf() {
			return pf;
		}

		public double getDa() {
			return da;
		}
		
		
		
}

