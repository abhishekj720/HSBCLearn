package com.hsbc.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class EmpServiceImpl extends UnicastRemoteObject implements IEmpService{

public EmpServiceImpl() throws RemoteException {

}

@Override
public String sayHello(String str) throws RemoteException {

return "dyuti welcomes "+str;
}

}