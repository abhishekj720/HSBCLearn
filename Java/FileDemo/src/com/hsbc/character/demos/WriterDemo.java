package com.hsbc.character.demos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class WriterDemo {

	public static void main(String[] args) throws IOException {
		
		
		File folder = new File("abhi_yes");
		if(!folder.exists()) {
			folder.mkdir(); //creates a new folder
		}
		FileWriter fw = new FileWriter("abhi_yes\\myfile.txt");
		BufferedWriter bw = new BufferedWriter(fw,1024*8);
		fw.write("There are 3 scope of variables\n");
		fw.write("local scope results in java stack\n");
		fw.close();
		System.out.println("byeeeeeeeeeeeee");

	}

}
