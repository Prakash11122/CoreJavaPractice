package com.it.pradhan.streamQuestions;

import java.util.function.BiPredicate;

public class BiPredicateEx9 {
	public static void main(String[] args) {
		
		BiPredicate<Integer, Integer> bip = (a,b) -> (a+b)%2 == 0;
		System.out.println(bip.test(10, 10));
		System.out.println(bip.test(11, 10));
	}

}
