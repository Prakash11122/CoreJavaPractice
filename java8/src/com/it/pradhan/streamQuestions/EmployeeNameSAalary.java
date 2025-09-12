package com.it.pradhan.streamQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.stream.*;

public class EmployeeNameSAalary {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("ramesh", 100.0));
		al.add(new Employee("rajesh", 300.0));
		al.add(new Employee("ramsh", 1400.0));
		al.add(new Employee("rakesh", 400.0));
		System.out.println("Original Emp: " + al);

		
		/*Function<Employee, Employee> func = emp -> new Employee(emp.getName(), emp.getSalary()+500);
		
		List<Employee> updatedEmp = al.stream()
										.map(func).collect(Collectors.toList());
		System.out.println("Updated Emp: " + updatedEmp);*/
		
		al.stream().forEach(emp -> emp.setSalary(emp.getSalary()+500));
		System.out.println("Updated Emp: " + al);

		
		
		
	}

}
