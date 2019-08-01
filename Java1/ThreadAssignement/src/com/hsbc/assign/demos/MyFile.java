package com.hsbc.assign.demos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class MyFile {

	private FileReader fr;
	private BufferedReader br;
	private String str = "";
	private boolean flag;
	
	public synchronized void read() throws IOException {
		if(flag)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		if(fr==null) {
			fr=new FileReader("readfile.txt");
			 br = new BufferedReader(fr);	
		}
			
		str=br.readLine();
		if(str!=null)
			System.out.println(Thread.currentThread().getName()+" read "+str);
		this.flag=true;
		notify();
		//br.close();
		//fr.close();
	}
	
	public synchronized void write() throws IOException {
		if(!flag)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		BufferedWriter bw=null;
		if(str != null) {
		FileWriter fw = new FileWriter("myfile.txt",true);
		bw = new BufferedWriter(fw,1024*8);
		bw.write(str+"\n");
		System.out.println(Thread.currentThread().getName()+" wrote "+str);
		bw.close();
		}
		this.flag=false;
		
		notify();
		
	}

	public synchronized String getStr() {
		return str;
	}
	
	
}
