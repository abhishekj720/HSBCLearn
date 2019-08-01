package com.hsbc.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloServiceImpl extends UnicastRemoteObject implements IHelloService{

public HelloServiceImpl() throws RemoteException {

}

@Override
public String sayHello(String str) throws RemoteException {

return "dyuti welcomes "+str;
}



}