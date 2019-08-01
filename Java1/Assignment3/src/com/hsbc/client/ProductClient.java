package com.hsbc.client;

import com.hsbc.service.Computer;
import com.hsbc.service.Fashion;
import com.hsbc.service.Product;

public class ProductClient {

	public static void main(String[] args) {
		Product[] arr = new Product[4];
		arr[0] = new Computer(1001, "HP", 30000);
		arr[1] = new Fashion(1002,"Zara",1500);
		arr[2] = new Computer(1003, "Dell", 50000);
		arr[3] = new Fashion(1004,"H&M",6000);
		System.out.println("------------------------------------------------------------------");
		System.out.printf("%10s%10s%20s%10s%10s\n","PTYPE","PID","PNAME","PRICE","RANGE");
		System.out.println("------------------------------------------------------------------");
	for(Product prod: arr)
	{
		System.out.printf("%10s%10d%20s%10.2f%10s\n",prod.getClass().getSimpleName(),prod.getPid(),prod.getPname(),prod.getPrice(),prod.range());
	}

	}
}
