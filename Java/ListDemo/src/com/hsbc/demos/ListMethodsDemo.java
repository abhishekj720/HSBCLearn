package com.hsbc.demos;

import java.util.ArrayList;
import java.util.List;

public class ListMethodsDemo {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
		lst.add("sam");
		lst.add("ram");
		lst.add("tom");
		lst.add("rimm");
		lst.add("ramaan");
		System.out.println(lst);
		lst.add(2, "peter");
		System.out.println("At index2"+lst.get(2));
		lst.remove("tom");
		System.out.println(lst);
		System.out.println("Size"+lst.size());
		lst.set(2, "vikas");
		System.out.println(lst);

	}

}
