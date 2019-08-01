package com.hsbc.assign.demos;

import java.io.IOException;

public class ReaderThread extends Thread{

	private MyFile f;
	
	public ReaderThread(MyFile f) {
		super();
		this.f=f;
	}
	
	public void run()
	{
		try {
			while(f.getStr() != null)
			     f.read();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
