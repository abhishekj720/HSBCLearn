package com.hsbc.server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import com.hsbc.service.EmpServiceImpl;
import com.hsbc.service.IEmpService;

public class EmpServer {
	
	public static void main(String[] args) throws RemoteException {
		IEmpService ser = new EmpServiceImpl();
		IEmpService stub = (IEmpService)UnicastRemoteObject.exportObject(ser,100);
		Registry registry = LocateRegistry.createRegistry(1088);
		registry.rebind("empser", stub);
		System.out.println("server started------------------------------");
	}

}
