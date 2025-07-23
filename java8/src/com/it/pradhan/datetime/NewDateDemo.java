package com.it.pradhan.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class NewDateDemo {

	public static void main(String[] args) {
		LocalDate of = LocalDate.of(2021, 01, 26);
		System.out.println(of);

		LocalDate date = LocalDate.now();
		System.out.println(date);

		LocalDate plusDays = date.plusDays(5);
		System.out.println(plusDays);

		date = date.plusMonths(1);
		System.out.println(date);

		date = date.plusYears(2);
		System.out.println(date);

		boolean leapYear = LocalDate.parse("2020-12-22").isLeapYear();
		System.out.println("Leap Year :: " + leapYear);

		LocalTime time = LocalTime.now();
		System.out.println(time);
		time = time.plusHours(2);
		System.out.println(time);

		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime);

		Period period = Period.between(LocalDate.parse("1999-03-15"), LocalDate.now());
		System.out.println(period);

		Duration duration = Duration.between(LocalTime.parse("18:00"), LocalTime.now());
		System.out.println(duration);

		

	}

}
