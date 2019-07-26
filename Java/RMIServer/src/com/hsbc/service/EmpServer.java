package com.hsbc.service;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class EmpServer {

	public static void main(String[] args) {


		try {
			IEmpService stub = new EmpServiceImpl();
			Registry registry = LocateRegistry.createRegistry(1089);
			registry.rebind("empser", stub);
			System.out.println("server started");
			} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
