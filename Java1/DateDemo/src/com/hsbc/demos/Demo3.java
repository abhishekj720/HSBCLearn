package com.hsbc.demos;

import java.sql.Date;
import java.time.LocalDate;

public class Demo3 {

	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		Date sqldt = Date.valueOf(today);
		System.out.println("sql date "+sqldt);
		
		LocalDate ldt = sqldt.toLocalDate();
		System.out.println("Local date = "+ ldt);
	}
}

