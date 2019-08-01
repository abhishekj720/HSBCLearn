package com.hsbc.character.demos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendDemo {

	public static void main(String[] args) throws IOException{
	FileWriter fw = new FileWriter("myfolder\\myfile.txt",true);
	BufferedWriter bw = new BufferedWriter(fw,1024*8);
	bw.write("there are 3 scopes of variables\n");
	bw.write("local scope resides in java stack\n");
	bw.close();
	fw.close();
	System.out.println("file appended");
}
}
