package com.it.pradhan.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateJoinDemo {

	public static void main(String[] args) {
		Employee emp1 = new Employee("prakash", "Delhi", "backend");
		Employee emp2 = new Employee("alok", "odisha", "frontend");
		Employee emp3 = new Employee("baudev", "hyd", "db");
		Employee emp4 = new Employee("prakash", "sai", "devops");
		
		
		List<Employee> employee = Arrays.asList(emp1,emp2,emp3,emp4);
		
		Predicate<Employee> predicate1 = (e) -> e.location.equals("hyd");
		Predicate<Employee> predicate2 = (e) -> e.dept.equals("db");
		Predicate<Employee> predicate3 = (e) -> e.name.startsWith("b");
		 
		
		Predicate<Employee> predicate = predicate1.and(predicate2).and(predicate3);
		
		for(Employee e:employee) {
			if(predicate.test(e)) {
				System.out.println(e.name);
			}
		}

	}

}
