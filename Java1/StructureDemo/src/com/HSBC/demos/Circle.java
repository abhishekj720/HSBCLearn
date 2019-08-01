package com.HSBC.demos;

import java.util.Scanner;

public class Circle {
	public static final int TWO = 2;


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter radius");
		int radius = s.nextInt();
		System.out.printf("Area = %.2f ", calcArea(radius));
		System.out.printf("Circumference = %.2f ", calcPerimeter(radius));
		s.close();

	}
	public static double calcArea(int radius)
	{
		return Math.PI*radius*radius;
		
	}
	public static double calcPerimeter(int radius)
	{
		return TWO *Math.PI*radius;
		}
}
