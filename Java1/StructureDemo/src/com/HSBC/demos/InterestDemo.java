package com.HSBC.demos;

import java.util.Scanner;

public class InterestDemo {
	public static final int HUNDRED = 100;

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter principle");
		double amt=s.nextDouble();
		System.out.println("enter rate");
		float rate=s.nextFloat();
		System.out.println("enter years");
		int years=s.nextInt();
		System.out.println("simple = " + calcSimple(amt,years,rate));
		System.out.println("compound = " + calcCompound(amt,years,rate));
		s.close();

	}
	public static double calcSimple(double amt, int years, float rate)
	{
		double si = amt*years*rate/HUNDRED;
		return si;
	}
	public static double calcCompound(double amt, int years, float rate)
	{
		double ci = amt * Math.pow ((1+rate/HUNDRED), years) - amt ;
		return ci;
	}
}
