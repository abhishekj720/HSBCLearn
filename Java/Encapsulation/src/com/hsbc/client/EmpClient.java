package com.hsbc.client;

import com.hsbc.service.Emp;

public class EmpClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Emp emp = new Emp(45,7000,"123Ram");
			System.out.println("Name"+ emp.getName());
			System.out.println("Age"+ emp.getAge());
			System.out.println("Salary"+ emp.getSal());
			System.out.println("PF"+ emp.getPf());
			System.out.println("Net Salary"+ emp.calcSalary());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("exsdcdsfefe"+ e.getMessage());
			e.printStackTrace();
		}
	
	}

}
