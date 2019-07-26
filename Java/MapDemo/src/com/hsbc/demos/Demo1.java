package com.hsbc.demos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new HashMap<>();
		map.put(1007, "Ram");
		map.put(1002, "sdfsRam");
		map.put(1005, "Ramsdfs");
		map.put(1001, "Ramsfdsfsfs");
		map.put(1003, "Ramdsfdsfsdfsdfsdfsdfwe");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the EID");
		int eid = scan.nextInt();
		if(map.containsKey(eid))
			System.out.println(map.get(eid));
		else
			System.out.println("No eid found");
		scan.close();
		

	}

}
