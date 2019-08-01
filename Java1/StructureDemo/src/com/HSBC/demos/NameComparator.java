package com.HSBC.demos;

import java.util.Comparator;

import com.HSBC.entity.Emp;

public class NameComparator implements Comparator<Emp> {

	@Override
	public int compare(Emp emp1, Emp emp2) {
		
		return emp1.getEmpName().compareTo(emp2.getEmpName());
	}

}
