package com.it.pradhan.datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo2 {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		
		//convert date string
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yy");
		String format = sdf.format(date);
		System.out.println(format);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("mm/dd/yy");
		String format2 = sdf2.format(date);
		System.out.println(format2);
		
		
		// Convert String to Date
				SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
				Date parsedDate = sdf3.parse("2022-12-20");
				System.out.println(parsedDate);
		
		
		

	}

}
