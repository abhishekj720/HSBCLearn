package com.hsbc.control.demos;

import com.hsbc.join.demos.AvgThread;
import com.hsbc.join.demos.SumThread;

public class SleepDemo2 {

	public static void main(String[] args)
	{
		AvgThread t1=new AvgThread();
		SumThread t2=new SumThread();
		t1.start();
		t2.start();
	}
}
