package com.hsbc.bytes.demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImage {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Public\\Pictures\\Sample Pictures\\Penguins.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("myimage.jpg");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		byte[] arr = new byte[fis.available()]; //it finds/return length of byte stream
		bis.read(arr); //reads the data to stream and into byte array
		
		
		
		fis.close();
		bis.close();
		fos.close();
		bos.close();
		System.out.println("file imag created");

	}

}
