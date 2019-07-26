package com.hsbc.service;

import java.util.Scanner;

public class Cylinder implements IShape {
	private static Cylinder cyl = new Cylinder();

	private double radius;
	private double height;
	
	private Cylinder() {
		
	}
	
	public static IShape getCylinder() {
		IShape shape = cyl ;
		return shape;
	}
	
	public double calcVolume(){
		return Math.PI*radius*radius*height;
	}
	
	@Override
	public void acceptData(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radius");
		this.radius=s.nextDouble();
		System.out.println("Enter the height");
		this.height=s.nextDouble();
		
	}
	
	

}