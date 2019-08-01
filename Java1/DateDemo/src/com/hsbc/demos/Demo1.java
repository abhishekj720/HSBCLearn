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
		LocalDate dt= LocalDate.of(2012, 5, 3);
		System.out.println("--------------------------------------------");
		System.out.println("day of month = "+dt.getDayOfMonth());
		System.out.println("Year = "+dt.getYear());
		System.out.println("month = "+dt.getMonth());
		System.out.println("after = "+dt.isAfter(LocalDate.now()));
		System.out.println("before = "+dt.isBefore(LocalDate.now()));
		System.out.println("equal = "+dt.isEqual(LocalDate.now()));
		System.out.println("Leap Year = "+dt.isLeapYear());
		System.out.println("--------------------------------------------");
		LocalDate today = LocalDate.now();
		System.out.println(today.plus(3,ChronoUnit.YEARS));
		System.out.println(today.plus(3,ChronoUnit.MONTHS));
		System.out.println(today.plus(3,ChronoUnit.DAYS));
	}

}
