package com.hsbc.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

import com.hsbc.entity.Emp;

public interface IEmpService extends Remote {
	
	Emp getEmployee(int eid)throws RemoteException; 
	
}
