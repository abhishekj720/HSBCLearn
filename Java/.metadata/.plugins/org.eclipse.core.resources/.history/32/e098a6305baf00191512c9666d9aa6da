package com.hsbc.client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.hsbc.service.IEmpService;

import java.net.MalformedURLException ;

public class Clients {

	public static void main(String[] args) throws MalformedURLException,RemoteException,NotBoundException{
		// TODO Auto-generated method stub
		
		Registry registry = LocateRegistry.getRegistry("localhost",1089);
		IEmpService ser = (IEmpService) registry.lookup("empser");
		System.out.println(ser.sayHello("ram"));
	}

}
