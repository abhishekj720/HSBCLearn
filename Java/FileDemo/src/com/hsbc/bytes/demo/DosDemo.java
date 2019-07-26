package com.hsbc.bytes.demo;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DosDemo {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("myFile3w.txt");
		DataOutputStream dos =new DataOutputStream(fos);
		dos.writeInt(1001);
		dos.writeUTF("Abhishek");
		dos.writeDouble(400.0);
		
		dos.close();
		fos.close();
		System.out.println("File created");

	}

}
