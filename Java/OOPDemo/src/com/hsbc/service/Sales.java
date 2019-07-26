package com.hsbc.service;

public class Sales {
	
	private String name;
	private double samt;
	
	public static int count ;
	public static double tsales;
	
	public Sales(String name, double samt) {
		super();
		this.name = name;
		this.samt = samt;
		++count ;
		tsales+= this.samt;
	}
	
	
}
