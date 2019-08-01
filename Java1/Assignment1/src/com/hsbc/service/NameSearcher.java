package com.hsbc.service;

public class NameSearcher {
	public static String[] arr= {"apple", "kiwi", "hsbc", "banana", "orange"};
	public boolean search(String key)
	{
		System.out.println("Linear Search");
		int flag=0;
		for(int i=0;i<arr.length;i++)
		{
			if(key.equals(arr[i]))
				{
				flag=1;				
				break;
				}
		}
		if(flag==0)
			return false;
		else
			return true;
	}
	public void display()
	{
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
	}
}
