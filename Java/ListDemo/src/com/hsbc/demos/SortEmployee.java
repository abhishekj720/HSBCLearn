package com.hsbc.demos;

import java.util.ArrayList;
import java.util.List;


import com.hsbc.entity.Emp;

public class SortEmployee {

	public static void main(String[] args) {
		
		List<Emp> lst = new ArrayList<>();
		lst.add(new Emp(1007,"ram",450005));
		lst.add(new Emp(1004,"aam",4520));
		lst.add(new Emp(1003,"addam",450));
		lst.add(new Emp(1008,"rsdfcsdam",425000));
		lst.add(new Emp(1002,"rdfvfdvgerream",03400));
		
//		lst.sort(null);
		for(Emp emp : lst) {
			System.out.println(emp);
		}
		
		System.out.println("-----------------------sort by name--------------");
		lst.sort(new NameComparator());
		for(Emp emp : lst) {
			System.out.println(emp);
		}
		
		System.out.println("---------Sort by salary-----------");;
		lst.sort(new SalaryComparator());
		for(Emp emp : lst) {
			System.out.println(emp);
		}
		
	}

}
