package com.hsbc.demos;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IterateMapDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new HashMap<>();
		map.put(1007, "Ram");
		map.put(1002, "sdfsRam");
		map.put(1005, "Ramsdfs");
		map.put(1001, "Ramsfdsfsfs");
		map.put(1003, "Ramdsfdsfsdfsdfsdfsdfwe");
		
		
		Set<Integer> keys = map.keySet();
		for(int key: keys)
			System.out.println(key+""+map.get(key));
		
		Collection<String> col = map.values();
		for(String str: col) {
			System.out.println(str);
		}
		
		Set<java.util.Map.Entry<Integer, String>> entries = map.entrySet();
		for(java.util.Map.Entry<Integer, String> entry: entries)
			System.out.println(entry.getKey()+""+entry.getValue());
	}

}
