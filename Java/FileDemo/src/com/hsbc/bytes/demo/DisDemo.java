package com.hsbc.bytes.demo;

import java.io.DataInputStream;
import java.io.IOException;

public class DisDemo {

	public static void main(String[] args) throws IOException{

		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("Enter emp 10");
		int eid = dis.readInt();
		System.out.println("Enter name ");
		String name = dis.readUTF();
		System.out.println("Enter salary");
		double sal = dis.readDouble();
		
		System.out.println(eid+" "+name+" "+sal);
	}

}