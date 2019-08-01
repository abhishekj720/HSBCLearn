package com.hsbc.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo1 {
	
	public static void main(String[] args)
	{
		Map<Integer,String> map = new HashMap<>();
		map.put(1007, "ram");
		map.put(1002, "tom");
		map.put(1004, "sam");
		map.put(1001, "peter");
		map.put(1006, "ravi");
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter EID");
		int eid = s.nextInt();
		if(map.containsKey(eid))
			System.out.println(map.get(eid));
		else
			System.out.println("no eid found");
		s.close();
		
	}

}
