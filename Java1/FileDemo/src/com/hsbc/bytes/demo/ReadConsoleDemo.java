package com.hsbc.bytes.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadConsoleDemo {

	public static void main(String[] args) throws IOException {
		InputStream in = System.in;
		InputStreamReader isr=new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter employee id");
		String eid = br.readLine();
		
		System.out.println("Enter employee name");
		String ename = br.readLine();
		
		System.out.println(eid+" "+ename);
		
		FileWriter fw = new FileWriter("myfile2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("EID"+" "+eid);
		bw.newLine();
		bw.write("ENAME"+" "+ename);
		bw.close();
		fw.close();
		System.out.println("console data is stored into file");
		

	}

}
