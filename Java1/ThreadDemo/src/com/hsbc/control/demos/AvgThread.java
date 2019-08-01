package com.hsbc.control.demos;

import com.hsbc.control.demos.MyUtil;

public class AvgThread extends Thread{

	@Override
	public void run() {
		try {
			if(MyUtil.data==0)
				Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(MyUtil.data/1000);
	}
	
	

}
