package com.hsbc.service;

public class Mtable {
	private int num;

	public Mtable(int num) throws Exception {
		super();
		if(num<=0)
			throw new Exception("Number must be greater than 0");
		this.num = num;
	}
	
	public void display()
	{
		for(int i=1;i<=10;i++)
		System.out.printf("%d * %d = %d\n" , num,i,(num*i));
	}
	
	public void display(int row)
	{
		for(int i=1;i<=row;i++)
		System.out.printf("%d * %d = %d\n" , num,i,(num*i));
	}
	
	public void display(int start, int end)
	{
		for(int i=start;i<=end;i++)
		System.out.printf("%d * %d = %d\n" , num,i,(num*i));
	}
}
