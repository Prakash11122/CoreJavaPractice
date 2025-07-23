package com.it.pradhan.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Duplicate {

	public static void main(String[] args) {
		
		//remove duplicates
		List<Integer> integerList = 
		         Arrays.asList(10, 20, 30, 43, 50,20, 30);
		List<Integer> collect = integerList.stream().distinct().collect(Collectors.toList());
		
		
		System.out.println(collect);
		
		//count unique numbers
		long count = integerList.stream().distinct().count();
		System.out.println(count);
		
		//check all the numbers are even or odd
		boolean allMatch = integerList.stream().allMatch(num->num%2==0);
		System.out.println(allMatch);
		
		//check there is any odd number or not
		
		boolean anyMatch = integerList.stream().anyMatch(num->num%2==1);
		System.out.println(anyMatch);
		
		
		//remove duplicates
		String s="programming";
		
		String collect2 = s.chars().mapToObj(ch->(char)ch).distinct().map(String::valueOf).collect(Collectors.joining());
		
		
		System.out.println(collect2);
		
		

	}

}
