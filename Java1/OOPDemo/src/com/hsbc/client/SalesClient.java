package com.hsbc.client;
import com.hsbc.service.Sales; 
public class SalesClient {

	public static void main(String[] args) {
		Sales s1=new Sales("ram",23000);
		Sales s2=new Sales("sam",40000);
		Sales s3=new Sales("tom",17000);
		
		System.out.println("no of instances "+ Sales.count);
		System.out.println("total sales "+ Sales.tsales);
		System.out.println("Average sales "+ (Sales.tsales/Sales.count));
	}

}
