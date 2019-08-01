package com.hsbc.control.demos;

import com.hsbc.control.demos.MyUtil;

public class SumThread extends Thread{

	@Override
	public void run() {
		int sum=0;
		for(int i=1;i<=1000;i++)
		{
			sum=sum+i*i;
		}
		MyUtil.data=sum;
	}

	
}
