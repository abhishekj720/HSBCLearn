package com.hsbc.client;

import com.hsbc.service.Nokia1100;
import com.hsbc.service.NokiaLumia;

public class NokiaClient {

	public static void main(String[] args) {
		Nokia1100 obj = new NokiaLumia();
		//obj.browseNet();
		obj.doConverse();
		obj.sendSms();
		//obj.doConverse2g();

	}

}
