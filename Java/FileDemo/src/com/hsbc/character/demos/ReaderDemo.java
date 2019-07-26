package com.hsbc.character.demos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("abhi_yes\\myfile.txt");
		BufferedReader br = new BufferedReader(fr);
		String str = null;
		while((str=br.readLine())!=null)
			System.out.println(str);
		br.close();
		fr.close();
		

	}

}
