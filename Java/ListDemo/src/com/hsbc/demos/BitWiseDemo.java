package com.hsbc.demos;

public class BitWiseDemo {

	public static void main(String[] args) {
		int oldCapacity = 15 ;
		int newCapacity = oldCapacity + (oldCapacity>>1);
		System.out.println(newCapacity);
		

	}

}
