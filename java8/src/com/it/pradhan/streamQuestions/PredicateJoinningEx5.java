package com.it.pradhan.streamQuestions;

import java.util.function.Predicate;

public class PredicateJoinningEx5 {

	public static void main(String[] args) {

		int[] arr = { 0, 21, 8, 24, 25, 32, 48, 50, 87, 96, 27, 59 };

		Predicate<Integer> p1 = num -> num % 2 == 0;
		Predicate<Integer> P2 = num -> num > 10;

		/*
		 * System.out.println("Print number which are even and greater than 10");
		 * 
		 * 
		 * for(Integer n:arr) { if(p1.and(P2).test(n)) { System.out.println(n); } }
		 */

		System.out.println("Print number which are even and greater than 10");

		for (Integer n : arr) {
			if (p1.or(P2).test(n)) {
				System.out.println(n);
			}
		}
	/*	output:Print number which are even and greater than 10
		0
		21
		8
		24
		25
		32
		48
		50
		87
		96
		27
		59 */
		
		
		System.out.println("Print number which Odd");

		for (int n : arr) {
			if (p1.negate().test(n)) {
				System.out.println(n);
			}
		}

		

	}

}
