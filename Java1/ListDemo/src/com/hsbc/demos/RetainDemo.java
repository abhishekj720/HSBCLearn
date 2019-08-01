package com.hsbc.demos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RetainDemo {

	public static void main(String[] args) {
		List<String> lst=new ArrayList<>();
		lst.add("ram");
		lst.add("sam");
		lst.add("tom");
		lst.add("peter");
		lst.add("akbar");
		lst.add("siva");
		lst.add("tom");
		System.out.println(lst);
		
		List<String> lst2 = Arrays.asList("tom","ram","akbar");
		lst.retainAll(lst2);
		System.out.println(lst);
		
	}

}
