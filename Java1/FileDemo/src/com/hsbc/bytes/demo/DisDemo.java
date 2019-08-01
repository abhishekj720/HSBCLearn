package com.hsbc.bytes.demo;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DisDemo {

	public static void main(String[] args) throws IOException {
		DataInputStream dis = new DataInputStream(new FileInputStream("myfile3.txt"));
		
		int eid=dis.readInt();
		String name=dis.readUTF();
		double sal=dis.readDouble();
		dis.close();
		
		System.out.println(eid+" "+name+" "+sal);

	}

}
