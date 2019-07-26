package com.hsbc.service;

import java.util.Scanner;

public class Cone implements IShape {

	private static Cone cone = new Cone();
	
	private double radius;
	private double height;
	
	private Cone() {
		
	}
	
	public static IShape getCone() {
		IShape shape = cone ;
		return shape ;
	}
	
	@Override
	public double calcVolume() {
		
		return 1/3.0*Math.PI*radius*radius*height;
	}

	@Override
	public void acceptData() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radius");
		this.radius=s.nextDouble();
		System.out.println("Enter the height");
		this.height=s.nextDouble();
		
	}
}