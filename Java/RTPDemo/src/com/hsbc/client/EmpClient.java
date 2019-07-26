package com.hsbc.client;

import com.hsbc.service.Contract;
import com.hsbc.service.Emp;
import com.hsbc.service.OnRoll;

public class EmpClient {

	public static void main(String[] args) {
		Emp[] arr = new Emp[4];
		arr[0] = new OnRoll(1001,"ram",2000);
		arr[1] = new Contract(1002,"sam",1500,22);
		arr[2] = new OnRoll(1003,"tom",23000);
		arr[3] = new Contract(1004,"sasfsm",15002,24);
		
		System.out.println("-----------------------------\n");
		System.out.printf("%10s%10s%20s%10s%10s%10s%10s%10s\n","ETYPE","EID","ENAME","SAL","PF","DA","DAYS","NS");
		System.out.println("-----------------------------\n");
		for(Emp emp: arr) {
			emp.display();
		}
		System.out.println("-----------------------------\n");
		
	}

}
