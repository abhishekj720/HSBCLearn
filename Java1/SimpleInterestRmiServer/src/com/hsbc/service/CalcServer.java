package com.hsbc.service;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalcServer {
	
	public static void main(String[] args) {
		try {
			ICalcService stub = new CalcServiceImpl();
			Registry registry = LocateRegistry.createRegistry(1088);
			registry.rebind("empser", stub);
			System.out.println("server started");
			} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
