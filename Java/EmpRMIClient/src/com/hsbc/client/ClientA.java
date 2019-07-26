package com.hsbc.client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.hsbc.service.IEmpService;

public class ClientA {

	public static void main(String[] args) throws NotBoundException {
		
		Registry registry;
		try {
			registry = LocateRegistry.getRegistry("192.168.0.3",1088);
			IEmpService ser = (IEmpService) registry.lookup("empser");
			System.out.println(ser.getEmployee(1002));
		}catch(RemoteException e) {
			System.out.println(e.getMessage());
		}

	}

}
