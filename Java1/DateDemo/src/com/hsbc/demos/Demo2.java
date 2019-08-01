package com.hsbc.demos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Demo2 {
	
	public static void main(String[] args) {
		String str = "12-06-2015";
		DateTimeFormatter df= DateTimeFormatter.ofPattern("dd-M-yyyy");
		LocalDate ldt = LocalDate.parse(str,df);
		System.out.println(ldt);
		
		LocalDate today=LocalDate.now();
		DateTimeFormatter df2= DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String res=today.format(df2);
		System.out.println(res);
		
	}

}
