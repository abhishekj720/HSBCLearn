package com.hsbc.bytes.demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream fis = new FileOutputStream("emp.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fis);
		Emp e1 = new Emp(1001,"ram","manager",2000);
		Emp e2 = new Emp(1002,"tom","clark",3400.0);
//		Emp e3 = new Emp(1003,"sam","associate",45000);
		
		oos.writeObject(e1);
		oos.writeObject(e2);
//		oos.writeObject(e3);
		
		oos.close();
		fis.close();
		
		System.out.println("Employee Serialized");

	}

}
