package com.it.pradhan.lambda;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<Integer> p = i -> i > 5;
		Predicate<Integer> p2 = i -> i >10;
		System.out.println(p.test(6));
		System.out.println(p2.test(1));

	}

}
