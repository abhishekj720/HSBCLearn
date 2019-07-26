package com.hsbc.service;

public class Bank implements Cdm,IAgent{

	private static Bank bank = new Bank();
	
	private Bank() {
		
	}
	
	public static Atm getAtm() {
		Atm atm = bank ;
		return atm;
	}
	
	public static Cdm getCdm() {
		Cdm cdm = bank ;
		return cdm;
	}
	
	public static IAgent getAgent() {
		IAgent agent = bank ;
		return agent ;
	}
	
	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("withdraw");
	}

	@Override
	public void getBalance() {
		// TODO Auto-generated method stub
		System.out.println("get balance");
	}

	@Override
	public void clearPdc() {
		// TODO Auto-generated method stub
		System.out.println("wcale pfd");
	}

	@Override
	public void asb() {
		// TODO Auto-generated method stub
		System.out.println("withdrawsafcsadacscsdcs");
	}

	
}
