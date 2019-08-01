package com.hsbc.client;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		String[] arr = {"ram", "tom", "same", "peter", "bala", "akbar", "vikas"};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.binarySearch(arr, "bala"));
		System.out.println(Arrays.binarySearch(arr,2,5,"bala"));
		}
	}

