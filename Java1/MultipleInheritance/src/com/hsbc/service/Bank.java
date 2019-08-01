package com.hsbc.service;

public class Bank implements Cdm, IAgent {

	private static Bank bank = new Bank();
	
	private Bank() {
		
	}
	
	public static Atm getAtm()
	{
		Atm atm = bank;
		return atm;
	}
	
	public static Cdm getCdm()
	{
		Cdm cdm = bank;
		return cdm;
	}
	public static IAgent getAgent()
	{
		IAgent agent = bank;
		return agent;
	}
	
	@Override
	public void withdraw() {
		System.out.println("Withdraw");
	}

	@Override
	public void getBalance() {
		System.out.println("get balance");
	}

	@Override
	public void clearPdc() {
		System.out.println("Clear pdc");
		
	}

	@Override
	public void deposit() {
		System.out.println("Deposit");
		
	}

}
