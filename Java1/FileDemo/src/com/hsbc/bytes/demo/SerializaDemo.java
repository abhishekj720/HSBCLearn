package com.hsbc.bytes.demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;

public class SerializaDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("emp.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Emp e1 = new Emp(1001, "ram","manager",45000.0);
		Emp e2 = new Emp(1002, "tom","clerk",25000.0);
		Emp e3 = new Emp(1003, "sam","associate",42000.0);
		
		oos.writeObject(e1);
		oos.writeObject(e2);
		oos.writeObject(e3);
		
		oos.close();
		fos.close();
		System.out.println("Employee serialized");
	}

}
