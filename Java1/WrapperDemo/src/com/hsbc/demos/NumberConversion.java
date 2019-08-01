package com.hsbc.demos;

public class NumberConversion {

	public static void main(String[] args) {
		int num=15;
		System.out.println("Binary " + Integer.toBinaryString(num));
		System.out.println("Octal " + Integer.toOctalString(num));
		System.out.println("Hexa " + Integer.toHexString(num));
	}

}
