package com.it.pradhan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmpData {

	public static void main(String[] args) {

		List<Employee> emps = new ArrayList<Employee>();

		emps.add(new Employee(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));

		emps.add(new Employee(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));

		emps.add(new Employee(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));

		emps.add(new Employee(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));

		emps.add(new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700.0));

		emps.add(new Employee(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));

		emps.add(new Employee(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));

		emps.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));

		emps.add(new Employee(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));

		emps.add(new Employee(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));

		emps.add(new Employee(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));

		emps.add(new Employee(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));

		emps.add(new Employee(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));

		emps.add(new Employee(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));

		emps.add(new Employee(15, "Ashok", 23, "Male", " Infrastructure", 2018, 12700.0));

		emps.add(new Employee(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));

		//Q2. print the name of all department in the organization
		/*
		 * emps.stream() .map(e -> e.getDepartment()) .distinct() .forEach(name ->
		 * System.out.println(name));
		 */
		
		
		//Q3.What is the average age os female and male employee?
		
		/*
		Map<String,Double> collect = emps.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge) ));
		System.out.println(collect); */
		
		//Q4.Get the name of all employee who joined after 2015
		
		List<String> collect = emps.stream()
		.filter(e -> e.getYearOfjoining() > 2015)
		.map(Employee::getName)
		.collect(Collectors.toList());
		
		System.out.println(collect);

	}

}
