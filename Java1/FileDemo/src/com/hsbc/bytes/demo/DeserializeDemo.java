package com.hsbc.bytes.demo;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("emp.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Emp emp=null;
		try {
			while(true) {
				emp=(Emp)ois.readObject();
				System.out.println(emp);
			}
		}catch(EOFException e) {
			System.out.println("end-of-file");
		}
		
		
		ois.close();
		fis.close();
	}

}
