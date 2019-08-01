package com.hsbc.bytes.demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class AddEmp {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("emp.dat",true);
		MyAppendStream oos = new MyAppendStream(fos);
		Emp e1 = new Emp(1004, "peter","manager",33000.0);
		Emp e2 = new Emp(1005, "soham","associate",20000.0);
		
		oos.writeObject(e1);
		oos.writeObject(e2);
		
		oos.close();
		fos.close();
		System.out.println("added");

	}

}
