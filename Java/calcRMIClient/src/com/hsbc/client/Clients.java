package com.hsbc.client;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.hsbc.service.IcalcService;

public class Clients {

	public static void main(String[] args) throws MalformedURLException,RemoteException,NotBoundException{
		// TODO Auto-generated method stub
		
		Registry registry = LocateRegistry.getRegistry("localhost",1088);
		IcalcService ser = (IcalcService) registry.lookup("calcser");
		System.out.println(ser.SI(100,100,2));
	}

}
