package com.it.pradhan.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo3 {

	public static void main(String[] args) {
		
		Person p1 = new Person("prakash", 25);
		Person p2 = new Person("santosh", 20);
		Person p3 = new Person("ashis", 12);
		Person p4 = new Person("kriti", 17);
		
		List<Person> persions = Arrays.asList(p1,p2,p3,p4);
		
		Predicate<Person> predicate = p -> p.age >= 18;
		 
        Predicate<Person> nameStartsWithA = person -> person.getName().startsWith("A"); // Name starts with 'A'

		
		for(Person persion:persions) {
			if(predicate.test(persion)){
				System.out.println(persion);
			}
		}

	}

}
