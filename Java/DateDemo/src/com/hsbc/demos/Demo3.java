package com.hsbc.demos;

import java.sql.Date;
import java.time.LocalDate;

public class Demo3 {

	public static void main(String[] args) {
	
		//converting local date into sql date
		LocalDate today = LocalDate.now();
		Date sqldt = Date.valueOf(today);
		System.out.println("sql date:"+ sqldt);
		
		//convert java.sql.Date into local date
		LocalDate ldt = sqldt.toLocalDate();
		System.out.println("LocalDate "+ldt);

	}

}
