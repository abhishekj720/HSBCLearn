package com.hsbc.service;

public class NokiaLumia extends Nokia1100 {
	
	private String camPx;	

	public NokiaLumia(double price, String camPx) {
		super(price);
		this.camPx = camPx;
	}
	public String getCamPx() {
		return camPx;
	}

	
	
}
