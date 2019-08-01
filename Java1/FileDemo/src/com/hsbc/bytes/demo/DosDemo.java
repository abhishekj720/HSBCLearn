package com.hsbc.bytes.demo;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DosDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("myfile3.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeInt(1001);
		dos.writeUTF("dyuti");
		dos.writeDouble(5000.0);
		dos.close();
		fos.close();
		System.out.println("file created");
	}

}
