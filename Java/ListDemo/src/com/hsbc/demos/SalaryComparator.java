package com.hsbc.demos;


import java.util.Comparator;
import com.hsbc.entity.Emp;


public class SalaryComparator implements Comparator<Emp> {

	@Override
	public int compare(Emp emp1, Emp emp2) {
		Double esal1 = emp1.getEmpSal();
		Double esal2 = emp2.getEmpSal();
		
		return esal1.compareTo(esal2);
	}
	}


