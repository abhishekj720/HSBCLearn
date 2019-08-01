package com.hsbc.client;

import com.hsbc.service.NokiaLumia;

public class NokiaClient {

	public static void main(String[] args) {
		NokiaLumia obj = new NokiaLumia(17000,"14.1p");
		System.out.println(obj.getPrice());
		System.out.print(obj.getCamPx());

	}

}
