package com.hsbc.demos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReatainDemo {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
		lst.add("sam");
		lst.add("ram");
		lst.add("tom");
		lst.add("rimm");
		lst.add("ramaan");
		System.out.println(lst);
		
		List<String> lst2 = Arrays.asList("tom","ram","saa");
		lst.retainAll(lst2);
		System.out.println(lst);

	}

}
