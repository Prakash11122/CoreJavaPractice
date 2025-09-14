package com.it.pradhan.streamQuestions;

import java.util.function.Predicate;

public class PredicateEx3 {

	public static void main(String[] args) {
		Predicate<String> stringPredicate = str -> str.length() > 5;
		boolean test = stringPredicate.test("Guna");
		System.out.println(test);

	}

}
