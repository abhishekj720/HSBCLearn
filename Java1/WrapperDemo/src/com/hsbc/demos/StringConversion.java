package com.hsbc.demos;

public class StringConversion {

	public static void main(String[] args) {
		String str1="56";
		String str2="10.2";
		int v1=Integer.parseInt(str1);
		double v2=Double.parseDouble(str2);
		double v3=v1*v2;
		System.out.println(v3);

	}

}
