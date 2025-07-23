package com.it.pradhan.methodReference;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<Employee> employees = EmployeeService.getEmployees();

		Optional<Employee> reduce3 = employees.stream().reduce((e1, e2) -> e1.getSalary() > e2.getSalary() ? e1 : e2);
		// System.out.println(reduce3.get());

		// find max age for employee

		Optional<Employee> maximumAge = employees.stream().reduce((m1, m2) -> m1.getAge() > m2.getAge() ? m1 : m2);
		System.out.println(maximumAge.get());

		// find total salary for all employee

		// employees.stream().reduce((e1, e2) -> e1.getSalary() + e2.getSalary());

		OptionalDouble reduce4 = employees.stream().mapToDouble(e -> e.getSalary()).reduce((sal1, sal2) -> sal1 + sal2);
		System.out.println(reduce4.getAsDouble());

		// find average salary

		OptionalDouble average = employees.stream().mapToDouble(e -> e.getSalary()).average();

		System.out.println(average.getAsDouble());

		// find list of employees names
		List<String> collect = employees.stream().map(e -> e.getName()).collect(Collectors.toList());
		System.out.println(collect);

		// find all salries >40000

		List<String> collect2 = employees.stream().filter(e -> e.getSalary() > 30000).map(e -> e.getName())
				.collect(Collectors.toList());
		System.out.println(collect2);

		// count total number of employees
		long count = employees.stream().count();
		System.out.println(count);

		// count total number of employees whose salary greater than 25000
		long count2 = employees.stream().filter(e -> e.getSalary() > 25000).count();
		System.out.println(count2);

		// find all employees starts with "M"

		List<Employee> collect3 = employees.stream().filter(e -> e.getName().startsWith("M"))
				.collect(Collectors.toList());
		System.out.println(collect3);

		Map<Integer, Employee> collectt = employees.stream().collect(Collectors.toMap(e -> e.getId(), e -> e));
		System.out.println("=================================");
		collectt.forEach((k, v) -> {
			System.out.println(k + ":" + v);
		});
	    System.out.println("=================================");
	    
	    employees.stream()
	    .collect(Collectors.toMap(
	        e->e.getId(),
	        e->e, 
	        (oldEmp,newEmp)->oldEmp));
	    
	    
	    LinkedHashMap<Integer, Employee> collect5 = employees.stream()
	    .collect(Collectors.toMap(
	        e->e.getId(),
	        e->e, 
	        (oldEmp,newEmp)->oldEmp,
	        LinkedHashMap::new
	        ));
	    
	    
	    collect5.forEach((k,v)->{
	      System.out.println(k+":"+v);
	    });
	}

}
