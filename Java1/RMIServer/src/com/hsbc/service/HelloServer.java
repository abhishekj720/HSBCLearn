package com.hsbc.service;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HelloServer {

	public static void main(String[] args) {


		try {
			IHelloService stub = new HelloServiceImpl();
			Registry registry = LocateRegistry.createRegistry(1000);
			registry.rebind("empser", stub);
			System.out.println("server started");
			} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}