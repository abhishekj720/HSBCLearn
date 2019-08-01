package com.hsbc.client;

public class RoundUtil {
	
	public static double round2Dec(double num) {
		return Math.round(num*100)/100.0;
	}
	public static double round2Dec(double num,int places) {
		double power = Math.pow(10, places);
		return Math.round(num*power)/power;
	}
	public static void main(String[] args) {
		double value = 56.237894;
		System.out.println(round2Dec(value));
		System.out.println(round2Dec(value,3));

	}

}
