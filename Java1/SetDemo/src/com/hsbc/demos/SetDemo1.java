package com.hsbc.demos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo1 {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		set.add("ram");
		System.out.println(set.add("tom"));
		set.add("sam");
		set.add("peter");
		set.add("Anand");
		System.out.println(set.add("tom"));
		System.out.println(set);
		

	}

}
