//Declare names in an array and print names which are starting with 'A' using lambda expression.

package com.it.pradhan.lambda;

import java.util.function.Predicate;

public class PredicateDemo2 {

	public static void main(String[] args) {
		
		String [] names = {"prakash", "soumya", "pritam","sagar","kuna"};
		
		
		Predicate<String> p = name -> name.charAt(0)=='p';
		
		for(String name:names) {
			if(p.test(name)) {
				System.out.println(name);
			}
		}

	}

}
