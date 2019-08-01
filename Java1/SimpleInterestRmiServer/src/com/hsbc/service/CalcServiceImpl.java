package com.hsbc.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalcServiceImpl extends UnicastRemoteObject implements ICalcService {

	public CalcServiceImpl() throws RemoteException {
		
	}

	@Override
	public double calcInterest(int principal, float rate, int time) throws RemoteException {
		
		return principal*rate*time/100;
	}

}
