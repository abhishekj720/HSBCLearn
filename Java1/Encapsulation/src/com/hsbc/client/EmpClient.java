package com.hsbc.client;
import com.hsbc.service.Emp;
public class EmpClient {

	public static void main(String[] args) {
		try {
			Emp emp = new Emp(22,"Ram",5000);
			System.out.println("Name " + emp.getName());
			System.out.println("Age "+emp.getAge());
			System.out.println("Salary "+emp.getSal());
			System.out.println("Pf "+emp.getPf());
			System.out.println("DA "+emp.getDa());
			System.out.println("Net salary "+emp.calcSalary());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
