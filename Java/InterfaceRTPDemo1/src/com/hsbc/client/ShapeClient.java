package com.hsbc.client;

import java.util.Scanner;

import com.hsbc.service.IShape;
import com.hsbc.util.ShapeFactory;

public class ShapeClient {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String menu = null;
		String opt=null;
		IShape shape=null;
		do
		{
		System.out.println("Enter the option");
		menu=s.next();
		shape=ShapeFactory.getShape(menu);
		if(shape!=null)
		{
			shape.acceptData();
			System.out.println(shape.calcVolume());
		}
		else
		{
			System.out.println("Invalid menu option");
		}
		System.out.println("press y to continue");
		opt=s.next();
	}while(opt.equals("y"));

	}
}
