package com.hsbc.demos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.hsbc.entity.Emp;

public class EmpDemo1 {
	
	public static void main(String[] args) {
		Set<Emp> set = new TreeSet<>();
		Emp e1=new Emp(1007,"ram",45000);
		set.add(e1);
		set.add(new Emp(1004,"babu",45000));
		set.add(new Emp(1001,"sam",45000));
		set.add(new Emp(1005,"vikas",45000));
		set.add(new Emp(1003,"akbar",45000));//ignored based on hashcode and equals
		set.add(new Emp(1001,"sam",45000));//ignored based on hashcode and equals
		set.add(new Emp(1004,"babu",45000));
		set.add(e1);//ignored based on the refernce
		
		for(Emp emp:set) {
			System.out.println(emp);
		}
	}

}
