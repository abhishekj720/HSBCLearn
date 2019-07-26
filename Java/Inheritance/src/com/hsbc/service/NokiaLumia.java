package com.hsbc.service;

public class NokiaLumia extends Nokia1100{
	
	public void BrowseNet() {
		System.out.println("browse net");
	}
	
	private String camPx;
	public NokiaLumia(double price,String camPx) {
		super(price);
		this.camPx = camPx;
	}

	@Override
	public void doConverse() {
		System.out.print("Do converse in Nokia Lumia");
	}

	public void doConverse2g() {
		super.doConverse();
	}
	public String getCamPx() {return camPx;}
}
