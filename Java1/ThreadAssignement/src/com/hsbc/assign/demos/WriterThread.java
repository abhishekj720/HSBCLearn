package com.hsbc.assign.demos;

import java.io.IOException;

public class WriterThread extends Thread{

	private MyFile f;
	
	public WriterThread(MyFile f) {
		super();
		this.f=f;
	}
	
	public void run()
	{
		try {
			while(f.getStr() != null)
			     f.write();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
