package com.hsbc.demo;
import java.util.Scanner;

public class Circle {
	public static final int TWO = 2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter radius");
		float r = scan.nextFloat();
		
		System.out.printf("Perimeter= %.2f", calcPerm(r));
		System.out.printf("Area= %.2f", Area(r));
	scan.close();
	}
	
	
	public static double calcPerm(float r) {
		
		return TWO*Math.PI*r;
		
	}
	
	public static double Area(float r) {
		
		return Math.PI*r*r;
	
	}

}
