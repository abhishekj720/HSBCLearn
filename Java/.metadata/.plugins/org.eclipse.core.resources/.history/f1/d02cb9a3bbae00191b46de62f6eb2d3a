package com.hsbc.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hsbc.entity.Emp;
import com.hsbc.exceptions.IDException;

public class EmpDaoImpl implements IEmpDao {

	private static Map<Integer, Emp> empDB= new HashMap<>();
	
	static {
		empDB.put(1001, new Emp(1001, "ram", 45000, LocalDate.of(2014, 05, 17), "hr"));
		empDB.put(1002, new Emp(1002, "tom", 35000, LocalDate.of(2015, 05, 17), "pr"));
		empDB.put(1003, new Emp(1003, "sam", 55000, LocalDate.of(2014, 07, 27), "pr"));
	}
	@Override
	public boolean addEmployee(Emp emp) throws IDException {
		if(empDB.containsKey(emp.getEmpId()))
			throw new IDException("ID already exists");
		empDB.put(emp.getEmpId(), emp);
		return true;
	}

	@Override
	public Emp viewEmployee(int eid) throws IDException {
		if(!empDB.containsKey(eid))
			throw new IDException("ID not found");
		
		return empDB.get(eid);
	}

	@Override
	public List<Emp> viewEmployee() {
		List<Emp> lst = new ArrayList<>(empDB.values());
		return lst;
	}

	@Override
	public boolean removeEmployee(int eid) throws IDException {
		if(!empDB.containsKey(eid))
			throw new IDException("ID not found");
		empDB.remove(eid);
		return true;
	}

	

}
