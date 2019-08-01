package com.hsbc.demos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDemo {
	
	public static void main(String[] args) {
		List<String> lst=new ArrayList<>();
		lst.add("ram");
		lst.add("sam");
		lst.add("tom");
		lst.add("peter");
		lst.add("akbar");
		System.out.println("-------------------Ascending order-------------------");
		lst.sort(null);
		for(String str:lst)
			System.out.println(str);
		
		System.out.println("-------------------Descending order-------------------");
		lst.sort(Collections.reverseOrder());
		for(String str:lst)
			System.out.println(str);
	}

}
