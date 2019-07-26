package com.hsbc.service;

public class Car {
	
	private String name;
	private double price;
	private String model;
	
	public Car(String name) {
		super();
		this.name = name;
		System.out.println("one constructor called");
	}

	public Car(String name, double price) {
		this(name);
		
		this.price = price;
		System.out.println("the arg constructor called");
	}

	public Car(String name, double price, String model) {
		this(name,price);
		
		this.model = model;
		System.out.println("three arg constructor called");
	
	}
	
	

	
	
}
