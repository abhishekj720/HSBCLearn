package com.hsbc.bytes.demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImage {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\Public\\Pictures\\Sample Pictures\\Penguins.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("myImage.jpg");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		byte[] arr = new byte[fis.available()];
		bis.read(arr);//reads data to stream and into byte array
		bos.write(arr);//writes byte array to stream
		bos.close();
		fos.close();
		bis.close();
		fis.close();
		System.out.println("file image copied");
		
	}

}
