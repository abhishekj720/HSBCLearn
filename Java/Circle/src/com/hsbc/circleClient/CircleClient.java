package com.hsbc.circleClient;

import java.util.Scanner;

import com.hsbc.circle.Circle;
import com.hsbc.util.HsbcUtil;



public class CircleClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter radius");
		int r = scan.nextInt();
//		 r = HsbcUtil.HUNDRED;
		Circle obj = new Circle();
		
		try {
			obj.setR(r);

			System.out.printf("Perimeter= %.2f", obj.calcPerm(r));
			System.out.printf("Area= %.2f", obj.Area(r));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
