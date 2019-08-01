package com.hsbc.join.demos;

import com.hsbc.control.demos.MyUtil;

public class AvgThread extends Thread{

	@Override
	public void run() {


		System.out.println(MyUtil.data/1000);
	}
	
	

}
