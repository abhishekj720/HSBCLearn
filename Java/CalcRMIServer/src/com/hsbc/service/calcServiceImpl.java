package com.hsbc.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class calcServiceImpl extends UnicastRemoteObject implements IcalcService  {
	
	public calcServiceImpl() throws RemoteException {
		
		
	}
	
	public double SI(int p,int r,int t) throws RemoteException {
		return p*r*t/100;
	}

	
}


