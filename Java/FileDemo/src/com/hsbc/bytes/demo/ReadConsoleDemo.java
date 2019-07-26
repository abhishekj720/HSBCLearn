package com.hsbc.bytes.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadConsoleDemo {

	public static void main(String[] args) throws IOException {
		
		InputStream in = System.in ;
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Entyere the emp 10");
		String eid = br.readLine();
		
		System.out.println("Enter the emp name");
		String name = br.readLine();
		System.out.println(eid+ " "+ name);
		
		FileWriter fw = new FileWriter("myFile2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("EID:"+ eid);
		bw.write("ENAME:"+ name);
		
		bw.close();
		fw.close();
		
		

	}

}
