package com.hsbc.service;

public class NokiaLumia extends Nokia1100 {
	public void browseNet() {
	System.out.println("Browse net");
	}

	@Override
	public void doConverse() {
		System.out.println("do converse - 4g");
	}
	
	public void doConverse2g()
	{
		super.doConverse();
	}
}
