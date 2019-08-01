package com.hsbc.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IHelloService extends Remote{

	public String sayHello(String str)throws RemoteException;
}
