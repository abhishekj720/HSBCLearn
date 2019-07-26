package com.hsbc.client;

import com.hsbc.service.*;

public class NokiaClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Nokia1100 obj = new NokiaLumia(17000,"oye");
		//obj.BrowseNet();
		obj.doConverse();
		obj.sendSms();
		

	}

}
