package com.hsbc.character.demos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterDemo {

	public  static void main(String[] args) throws IOException
	{
		File folder = new File("myfolder");
		if(!folder.exists())
			folder.mkdir();//creates a new folder
		FileWriter fw = new FileWriter("myfolder\\myfile.txt");
		BufferedWriter bw = new BufferedWriter(fw,1024*8);
		fw.write("there are 3 scopes of variables\n");
		fw.write("local scope resides in java stack\n");
		fw.close();
		System.out.println("file created");
	}
}
