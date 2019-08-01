package com.hsbc.service;

import java.util.Arrays;
import java.util.Collections;

public class NewNameSearcher extends NameSearcher {
	
	
	public boolean search(String key)
	{
		boolean res = super.search(key);
		System.out.println(res);
		System.out.println("Binary Search");
		Arrays.sort(arr);
		if(Arrays.binarySearch(arr,key)>0)
			return true;
		else
			return false;
				
	}
	public void display(String order)
	{
		if(order.equals("asc"))
		{
			Arrays.sort(arr);
			for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		}
		else
		{
			Arrays.sort(arr,Collections.reverseOrder());
			for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		}
	}
}
