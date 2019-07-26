package com.hsbc.client;

import com.hsbc.service.Sales;

public class SalesClient {
	
	public static void main(String[] args) {
		
		Sales s1 = new Sales("ram",20000);
		Sales s2 = new Sales("aam",60000);
		Sales s3 = new Sales("vam",70000);
//		Sales s4 = new Sales("ram",20000);
		
		System.out.println("No of Instances"+ Sales.count);
		System.out.println("Total sales"+ Sales.tsales);
		System.out.println("Average Sales"+ (Sales.tsales/Sales.count));
	}

}
