package com.hsbc.demos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDemo {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
		lst.add("sam");
		lst.add("ram");
		lst.add("tom");
		lst.add("rimm");
		lst.add("ramaan");
		lst.sort(null);
		System.out.println(lst);
		lst.sort(Collections.reverseOrder());
		System.out.println(lst);

	}

}
