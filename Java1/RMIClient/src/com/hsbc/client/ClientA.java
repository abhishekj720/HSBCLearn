package com.hsbc.client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.hsbc.service.IHelloService;

public class ClientA {

	public static void main(String[] args) throws RemoteException, NotBoundException {
		
		Registry registry = LocateRegistry.getRegistry("localhost",1000);
		IHelloService ser = (IHelloService)registry.lookup("empser");
		System.out.println(ser.getClass().getName());
		System.out.println(ser. sayHello("ram"));
	}
}
