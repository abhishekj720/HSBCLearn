package com.hsbc.client;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr = {"ram","shyam","NO my name","good job","addy","natalia","night"};
		Arrays.sort(arr);
		System.out.println((Arrays.toString(arr)));
		System.out.println(Arrays.binarySearch(arr, "natalia"));
		System.out.println(Arrays.binarySearch(arr,5,7,"natalia"));
		
	}

}
