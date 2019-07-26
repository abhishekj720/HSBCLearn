package com.hsbc.client;

import com.hsbc.service.Computer;
import com.hsbc.service.Fashion;
import com.hsbc.service.HCart;

public class HCARTClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HCart[] arr = new HCart[4];
		arr[0] = new Computer(1001,"ram",2000);
		arr[1] = new Fashion(1002,"sam",1500);
		arr[2] = new Computer(1003,"tom",23000);
		arr[3] = new Fashion(1004,"sasfsm",150);
		
		System.out.println("-----------------------------\n");
		System.out.printf("%10s%10s%20s%10s%10s\n","PTYPE","PID","PNAME","PRICE","RANGE");
		System.out.println("-----------------------------\n");
		for(HCart prod: arr) {
			System.out.printf("%10s  %10.2f%20s%10d%10s\n",prod.getClass().getSimpleName(),prod.getPid(),prod.getPname(),prod.getPrice(),prod.calcRange());
		}
		System.out.println("-----------------------------\n");
		
	}


	}


