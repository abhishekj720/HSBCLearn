package com.hsbc.client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.hsbc.service.ICalcService;

public class ClientSI {
	
public static void main(String[] args) throws RemoteException, NotBoundException {
		
		Registry registry = LocateRegistry.getRegistry("localhost",1088);
		ICalcService ser = (ICalcService)registry.lookup("empser");
		System.out.println(ser. calcInterest(20000,5,2));
	}

}
