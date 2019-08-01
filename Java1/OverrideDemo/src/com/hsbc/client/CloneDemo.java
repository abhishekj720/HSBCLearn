package com.hsbc.client;

import com.hsbc.service.Emp;

public class CloneDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Emp e1=new Emp(1001, "Ram");
		Emp e2=(Emp)e1.clone();
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1==e2);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          

	}

}
