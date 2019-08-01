package com.hsbc.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICalcService extends Remote {

	public double calcInterest(int principal,float rate,int time) throws RemoteException;
}
