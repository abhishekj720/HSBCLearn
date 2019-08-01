package com.hsbc.service;

import java.util.Scanner;

public class Sphere implements IShape {

	private static Sphere sph = new Sphere();

	private double radius;
	
	private Sphere() {}
	public static IShape getSphere() {
		IShape shape = sph;
		return shape;
	}
	@Override
	public double calcVolume() {
		return 4/3.0*Math.PI*radius*radius*radius;
	}
	
	@Override
	public void acceptData() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radius");
		this.radius=s.nextDouble();
		s.close();
	}
}
