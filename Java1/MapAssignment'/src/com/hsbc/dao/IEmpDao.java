package com.hsbc.dao;

import java.util.List;

import com.hsbc.entity.Emp;
import com.hsbc.exceptions.IDException;

public interface IEmpDao {

	boolean addEmployee(Emp emp)throws IDException;
	Emp viewEmployee(int eid)throws IDException;
	List<Emp> viewEmployee();
	List<Emp> viewEmployee(String dept);
	boolean removeEmployee(int eid)throws IDException;
}
