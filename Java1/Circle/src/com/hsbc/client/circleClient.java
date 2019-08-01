package com.hsbc.client;
import com.hsbc.service.circle;
import java.util.Scanner;

public class circleClient {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter radius");
		int radius = s.nextInt();
		
		circle c = new circle();
		try {
			c.setRadius(radius);
			System.out.printf("Area = %.2f ", c.calcArea(radius));
			System.out.printf("Circumference = %.2f ", c.calcPerimeter(radius));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		s.close();
	}

}
