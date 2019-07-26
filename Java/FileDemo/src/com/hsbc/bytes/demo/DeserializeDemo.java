package com.hsbc.bytes.demo;

import java.io.EOFException;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.ObjectInputStream;


public class DeserializeDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("emp.dat");
		ObjectInputStream oos = new ObjectInputStream(fis);
		Emp emp = null;
		try {
			while(true) {
				emp = (Emp)oos.readObject();
				System.out.println(emp);
			}
		}catch(EOFException ex) {
			System.out.println("end of file reached");
		}
		
		
		
		
		oos.close();
		fis.close();

	}

}
