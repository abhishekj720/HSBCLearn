package com.hsbc.character.demos;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PwDemo {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter out = new PrintWriter("hsbc.txt");
		out.println("-----------------------------------------------------");
		out.printf("%10d%20s%10.2f\n", 1001,"ram",45000.3445);
		out.printf("%10d%20s%10.2f\n", 1002,"tom",35000.1234);
		out.printf("%10d%20s%10.2f\n", 1003,"sam",22000.1235);
		out.println("-----------------------------------------------------");
		out.close();
		System.out.println("report generated");
	}
}
