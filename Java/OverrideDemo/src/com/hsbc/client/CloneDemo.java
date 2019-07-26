package com.hsbc.client;


import com.hsbc.service.*;
public class CloneDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Emp s1 = new Emp(1001,"ram");
		Emp s2 = (Emp)s1.clone();
		System.out.print(s1);
		System.out.print(s2);

	}

}
