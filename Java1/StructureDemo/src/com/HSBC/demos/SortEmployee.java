package com.HSBC.demos;
import java.util.ArrayList;
import java.util.List;

import com.HSBC.entity.Emp;
public class SortEmployee {

	public static void main(String[] args) {
		List<Emp> lst = new ArrayList<>();
		lst.add(new Emp(1007, "ram",45000));
		lst.add(new Emp(1004, "babu",15000));
		lst.add(new Emp(1001, "sam",25000));
		lst.add(new Emp(1005, "vikas",18000));
		lst.add(new Emp(1003, "akbar",35000));
		
		System.out.println("------------sort by ID----------------");
		lst.sort(null);
		for(Emp emp:lst) {
			System.out.println(emp);
		}
		
		System.out.println("------------sort by Name----------------");
		lst.sort(new NameComparator());
		for(Emp emp:lst) {
			System.out.println(emp);
		}
		
		System.out.println("------------sort by Salary----------------");
		lst.sort(new SalaryComparator());
		for(Emp emp:lst) {
			System.out.println(emp);
		}
		
		
	}

}
