package com.hsbc.character.demos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class AppendDemo {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("abhi_yes\\myfile.txt",true);
		BufferedWriter bw = new BufferedWriter(fw,1024*8);
		bw.write("There are 3 scope of variables\n");
		bw.write("local scope results in java stack\n");
		bw.close();
		System.out.println("byeeeeeeeeeeeee");

	}

}
