package com.hsbc.demos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Demo1 {

	public static void main(String[] args) {
		
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		
		LocalDate ldt = LocalDate.of(2012, 5, 23);
		System.out.println(ldt.getDayOfMonth());
		System.out.println(ldt.getYear());
		System.out.println(ldt.getMonth());
		System.out.println(ldt.isAfter(LocalDate.now()));
		System.out.println(ldt.minusYears(ldt.getYear()));
		LocalDate today = LocalDate.now();
		System.out.println(today.plus(3,ChronoUnit.YEARS));
		System.out.println(today.plus(3,ChronoUnit.MONTHS));

	}

}
