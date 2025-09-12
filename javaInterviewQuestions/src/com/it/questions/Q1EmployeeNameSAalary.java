package com.it.questions;

import java.util.ArrayList;

public class Q1EmployeeNameSAalary {

	public static void main(String[] args) {
		ArrayList<Q1Employee> al = new ArrayList<Q1Employee>();
		al.add(new Q1Employee("ramesh", 100.0));
		al.add(new Q1Employee("rajesh", 300.0));
		al.add(new Q1Employee("ramsh", 1400.0));
		al.add(new Q1Employee("rakesh", 400.0));
		System.out.println("Original Emp: " + al);

		
		/*Function<Employee, Employee> func = emp -> new Employee(emp.getName(), emp.getSalary()+500);
		
		List<Employee> updatedEmp = al.stream()
										.map(func).collect(Collectors.toList());
		System.out.println("Updated Emp: " + updatedEmp);*/
		
		al.stream().forEach(emp -> emp.setSalary(emp.getSalary()+500));
		System.out.println("Updated Emp: " + al);

		
		
		
	}

}
