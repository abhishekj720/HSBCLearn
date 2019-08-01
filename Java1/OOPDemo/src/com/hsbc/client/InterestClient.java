package com.hsbc.client;

import java.util.Scanner;
import com.hsbc.service.Interest;

public class InterestClient {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter principle");
		double amt=s.nextDouble();
		System.out.println("enter rate");
		float rate=s.nextFloat();
		System.out.println("enter years");
		int years=s.nextInt();
		s.close();
		
		Interest obj = new Interest();
		try {
			obj.setAmt(amt);
			obj.setRate(rate);
			obj.setYears(years);
			System.out.println("simple = " + obj.calcSimple());
			System.out.println("compound = " + obj.calcCompound());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
		s.close();	

	}

}
