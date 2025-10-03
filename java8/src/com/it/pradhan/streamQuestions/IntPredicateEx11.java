package com.it.pradhan.streamQuestions;

import java.util.function.IntPredicate;

public class IntPredicateEx11 {

	public static void main(String[] args) {
		
		IntPredicate p = i -> i%2==0;
		boolean test = p.test(10);
		System.out.println(test);

	}

}
