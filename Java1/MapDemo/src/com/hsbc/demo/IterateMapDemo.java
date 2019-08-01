package com.hsbc.demo;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IterateMapDemo {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(2007, "ram");
		map.put(1002, "tom");
		map.put(1004, "sam");
		map.put(1001, "peter");
		map.put(1006, "ravi");
		map.put(1002, "jack");
		map.put(3006, "ashvin");
		map.put(3002, "bala");
		
		//using key set method
		Set<Integer> keys = map.keySet();
		for(int key: keys)
			System.out.println(key+" "+map.get(key));
		System.out.println("----------------------------------------------");
		Collection<String> col = map.values();
		for(String str:map.values())
			System.out.println(str);
		
		System.out.println("----------------------------------------------");
		Set<java.util.Map.Entry<Integer, String>> entries = map.entrySet();
		for(java.util.Map.Entry<Integer, String> entry:entries)
			System.out.println(entry.getKey()+" "+entry.getValue());
	}

}
