package com.hsbc.assign.demos;

public class FileClient {

	public static void main(String[] args) {
		MyFile f = new MyFile();
		ReaderThread t1 = new ReaderThread(f);
		t1.setName("Reader");
		WriterThread t2= new WriterThread(f);
		t2.setName("Writer");
		
		t1.start();
		t2.start();
	
	}

}
