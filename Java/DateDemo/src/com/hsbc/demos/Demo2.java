package com.hsbc.demos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Demo2 {

	public static void main(String[] args) {
		
		//convert string into local date
		String str = "22-06-2015";
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-M-yyyy");
		LocalDate ldt = LocalDate.parse(str,df);
		System.out.println(ldt);
		
		//convert local date into string
		LocalDate today = LocalDate.now();
		DateTimeFormatter dd= DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String res  = today.format(dd);
		System.out.println(res);
	}

}