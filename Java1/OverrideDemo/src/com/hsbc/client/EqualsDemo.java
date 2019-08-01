package com.hsbc.client;

import com.hsbc.service.Emp;

public class EqualsDemo {

	public static void main(String[] args) {
		Emp e1 = new Emp(1001, "Ram");
		Emp e2 = new Emp(1001, "Ram");
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));//e1 and e2 are referencing emp instance
	}

}
