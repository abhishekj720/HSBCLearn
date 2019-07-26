package com.hsbc.demos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Set<String> set = new TreeSet<>();
		set.add("ram");
		set.add("tom");
		set.add("alex");
		System.out.println(set.add("aaaaaaaaaaaaaaa"));
		set.add("rama");
		set.add("toma");
		set.add("alexaaa");
		set.add("ramaaaa");
		set.add("tomaaa");
		set.add("alexaaaaa");
		System.out.println(set.add("tom"));
		
		System.out.println(set);

	}

}
