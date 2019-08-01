package com.hsbc.demos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListMethodsDemo {

	public static void main(String[] args) {
		List<String> lst=new LinkedList<>();
		lst.add("ram");
		lst.add("sam");
		lst.add("tom");
		lst.add("peter");
		lst.add("akbar");
		lst.add("siva");
		lst.add("tom");
		System.out.println(lst);
		lst.add(2,"peter");
		System.out.println(lst);
		System.out.println("At index 2 "+lst.get(2));
		lst.remove("tom");
		System.out.println(lst);
		lst.remove(4);
		System.out.println(lst);
		System.out.println("Size "+lst.size());
		lst.set(2, "dyuti");
		System.out.println(lst);
		System.out.println("Search dyuti "+lst.contains("dyuti"));
	}

}
