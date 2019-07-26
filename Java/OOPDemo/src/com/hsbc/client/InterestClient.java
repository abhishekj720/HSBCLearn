package com.hsbc.client;

import java.util.Scanner;
import com.hsbc.service.Interest;

public class InterestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the principle");
		double amt = scan.nextDouble();
		System.out.println("Enter the rate");
		float rate = scan.nextFloat();
		System.out.println("years");
		int years = scan.nextInt();
		
		Interest obj = new Interest();
		try {
			obj.setAmt(amt);
			obj.setYears(years);
			obj.setRate(rate);
			System.out.println("Simple"+ obj.calcSimple());
			System.out.println("Compound"+ obj.calcCompound());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		
		
		scan.close();
	}

}
