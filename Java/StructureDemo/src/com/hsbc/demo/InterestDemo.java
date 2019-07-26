package com.hsbc.demo;

import java.util.Scanner;

public class InterestDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the principle");
		double amt = scan.nextDouble();
		System.out.println("Enter the rate");
		float rate = scan.nextFloat();
		System.out.println("years");
		int years = scan.nextInt();
		
		System.out.println("Simple"+ calcSimple(amt,years,rate));
		System.out.println("Compound"+ calcComp(amt,years,rate));
		scan.close();
	}
	
	public static double calcSimple(double amt,int years,float rate) {
		double si = amt*years*rate/100.0;
		return si;
	}
	
	public static double calcComp(double amt,int years,float rate) {
		double ci = amt*Math.pow(1+ rate/100, years) - amt;
		return ci;
	}

}
