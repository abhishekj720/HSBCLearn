package com.hsbc.character.demos;

import java.io.PrintWriter;
import java.io.FileNotFoundException ;

public class PwDemo {

	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter out = new PrintWriter("hsbc.txt");
		out.printf("=------------------------------------------------------------------------=");
		out.printf("%10d%20s%10.2f",1001,"ram",4500.0);
		out.printf("%10d%20s%10.2f",1002,"ssssram",4500.0);
		out.printf("%10d%20s%10.2f",1003,"sssssssssram",4500.0);
		out.println("--------------------------------");
		out.close();
		System.out.println("report generated");

	}

}
