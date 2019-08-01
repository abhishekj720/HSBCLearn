package com.hsbc.sync.demos;

public class Account {

	public synchronized void doTransaction() {
		for(int i=1;i<=500;i++)
			System.out.println(Thread.currentThread().getName()+" transaction in progress ");
		System.out.println(Thread.currentThread().getName()+" transaction completed ");

	}
	public  void getBalance() {
		for(int i=1;i<=500;i++)
			System.out.println(Thread.currentThread().getName()+" balance in progress ");
		System.out.println(Thread.currentThread().getName()+" Balance shown ");
	}
}