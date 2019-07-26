package com.hsbc.inter.demos;

import java.util.Scanner;

public class MyQueue {

	private String data;
	private static Scanner sc = new Scanner(System.in);
	private boolean flag;
	
	public synchronized void put() {
		if(flag) {
			try {
				wait();
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Enter the data");
		data = sc.next();
		this.flag = true;
		notify();
		
	}
	
	public synchronized void get() {
		if(!flag)
			try {
				wait();
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		System.out.println(data);
		this.flag = false ;
		notify();
	}
	
}
