package com.hsbc.demos;

import java.util.Comparator;
import com.hsbc.entity.Emp;

public class NameComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp emp1, Emp emp2) {
		String ename1 = emp1.getEmpName();
		String ename2 = emp2.getEmpName();
		
		return ename1.compareTo(ename2);
	}
	
	

}
