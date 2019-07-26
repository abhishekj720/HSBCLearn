package com.hsbc.demos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.hsbc.entity.Emp;

public class EmpDemo1 {

	public static void main(String[] args) {
		
		Set<Emp> set = new HashSet<>();
		Emp e1 = new Emp(1007,"ram",45000);
		set.add(e1);
		set.add(new Emp(1002,"wesfwam",450200));
		set.add(new Emp(1003,"rasfsm",453));
		set.add(new Emp(1001,"rsam",4510));
		set.add(new Emp(10087,"rsssssssssam",45322000));
		
		set.add(new Emp(1047,"ramaaaaaaaaa",45230));
		set.add(new Emp(1001,"rsam",4510));
		set.add(e1);//ignored based on reference
		
		for(Emp emp: set)
			System.out.println(emp);

	}

}
