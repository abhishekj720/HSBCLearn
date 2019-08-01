package com.hsbc.client;

import com.hsbc.service.Atm;
import com.hsbc.service.Bank;
import com.hsbc.service.IAgent;

public class BankClient {

	public static void main(String[] args)
	{
		Atm atm = Bank.getAtm();
		atm.getBalance();
		atm.withdraw();
		
		IAgent agent = Bank.getAgent();
		agent.clearPdc();
		
		
		
	}
}
