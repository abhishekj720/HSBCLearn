package com.hsbc.demos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AddAllDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();
		set.add("ram");
		set.add("tom");
		set.add("alex");
		
		List<String> lst = new ArrayList<>();
		lst.addAll(set);
		System.out.println(lst);
		lst.add("varama");
		lst.add("kaahe ko");
		System.out.println(lst);
		
		List<String> sublist = lst.subList(1, 4);
		System.out.println(sublist);

	}

}
