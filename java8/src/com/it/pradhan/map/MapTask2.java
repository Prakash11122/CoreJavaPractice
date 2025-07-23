//Task : Print Emp Name with Emp age whose salary is >= 50,000 using Stream API.
package com.it.pradhan.map;

import java.util.stream.Stream;

public class MapTask2 {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("John", 35, 55000.00);
		Employee e2 = new Employee("David", 25, 45000.00);
		Employee e3 = new Employee("Buttler", 35, 35000.00);
		Employee e4 = new Employee("Steve", 45, 65000.00);
		
		Stream<Employee> stream = Stream.of(e1,e2,e3,e4);
		
		stream.filter(e -> e.salary >= 50000.00)
		.map(e -> e.getName() + "-" + e.getAge())
		.forEach(e-> System.out.println(e));
		

	}

}
