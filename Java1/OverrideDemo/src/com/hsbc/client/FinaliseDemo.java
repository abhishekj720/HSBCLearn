package com.hsbc.client;

import java.util.Scanner;

import com.hsbc.service.Emp;

public class FinaliseDemo {

	public static void main(String[] args) {
		Emp e1 = new Emp(1001,"Ram");
		Emp e2 = new Emp(1002,"sam");
		Emp e3 = new Emp(1003,"Tom");
		
		e1=null;
		e3=null;
		System.gc();
		Scanner s = new Scanner(System.in);
		System.out.println("Press any key to continue");
		String str= s.next();
		e2=null;
		System.gc();
		System.out.println("Press any key to ocntinue");
		str=s.next();
		s.close();

	}

}
