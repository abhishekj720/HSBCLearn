package com.hsbc.service;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

import com.hsbc.entity.Emp;

public class EmpServiceImpl implements IEmpService {

	private static Map<Integer,Emp> map = new HashMap<>();
	static {
		map.put(1001, new Emp(1001,"ram",45000));
		map.put(1002, new Emp(1002,"sam",55000));
		map.put(1003, new Emp(1003,"tom",35000));
		map.put(1004, new Emp(1004,"jim",25000));
		map.put(1005, new Emp(1005,"jam",50000));
	}
	@Override
	public Emp getEmployee(int eid) throws RemoteException {
		if(map.containsKey(eid))
			return map.get(eid);
		throw new RemoteException("Employee ID not found");
	}

}
