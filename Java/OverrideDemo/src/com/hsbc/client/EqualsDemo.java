package com.hsbc.client;

import com.hsbc.service.Emp;

public class EqualsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp s1 = new Emp(1001,"ram");
		Emp s2 = new Emp(1001,"ram");
		System.out.print(s1 == s2);
		System.out.print(s1.equals(s2));

	}

}
