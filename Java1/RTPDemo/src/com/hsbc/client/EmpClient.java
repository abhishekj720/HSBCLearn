package com.hsbc.client;

import com.hsbc.service.Contract;
import com.hsbc.service.Emp;
import com.hsbc.service.Onroll;

public class EmpClient {

	public static void main(String[] args) {
		
		Emp[] arr = new Emp[4];
		arr[0] = new Onroll(1001, "ram", 20000);
		arr[1] = new Contract(1002,"sam",1500, 22);
		arr[2] = new Onroll(1003, "tom", 30000);
		arr[3] = new Contract(1004,"peter",2000,20);
		
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.printf("%10s%10s%20s%10s%10s%10s%10s%10s\n","ETYPE","EID","ENAME","SAL","PF","DA","DAYS","NS");
		System.out.println("---------------------------------------------------------------------------------------------");
		for(Emp emp:arr) {//dynamic binding instance
			emp.display();
		}
		
 
	}

}
