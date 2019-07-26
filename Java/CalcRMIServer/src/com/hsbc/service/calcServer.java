package com.hsbc.service;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class calcServer {

	public static void main(String[] args) {
		
		try {
				IcalcService stub = new calcServiceImpl();
				Registry registry = LocateRegistry.createRegistry(1088);
				registry.rebind("calcser", stub);
				System.out.println("server yessssssssssss");
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}