//Task-1 : Print emp names who are working in Hyd location in DB team.
package com.it.pradhan;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateJoinDemo {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Anil", "Chennai", "DevOps");
		Employee e2 = new Employee("Rani", "Pune", "Networking");
		Employee e3 = new Employee("Ashok", "Hyd", "DB");
		Employee e4 = new Employee("Ganesh", "Hyd", "DB");
		
		
		List<Employee> emps = Arrays.asList(e1,e2,e3,e4);
		
		Predicate<Employee> p1 = (e) -> e.location.equals("Hyd");
		Predicate<Employee> p2 = (e) -> e.dept.equals("DB");
		
		Predicate<Employee> p = p1.and(p2);
		
		for(Employee employees : emps) {
			if(p.test(employees)) {
				System.out.println(employees.name);
			}
		}
		
		
	
	}

}
