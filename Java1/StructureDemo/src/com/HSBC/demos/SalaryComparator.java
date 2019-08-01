package com.HSBC.demos;

import java.util.Comparator;

import com.HSBC.entity.Emp;

public class SalaryComparator implements Comparator<Emp> {

	@Override
	public int compare(Emp e1, Emp e2) {
		Double sal1=e1.getEmpSal();
		Double sal2=e2.getEmpSal();
		return sal1.compareTo(sal2);
	}

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            