package com.it.pradhan.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstFilterDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(20, 18, 44, 33, 98, 3, 10);

		/*
		 * for(Integer i:list) { if(i>20) { System.out.println(i); } }
		 */

		/*Stream<Integer> stream = list.stream();
		Stream<Integer> filteredStream = stream.filter(i -> i > 20);
		filteredStream.forEach(i -> System.out.println(i));*/
		
		Stream<Integer> stream = list.stream();
		Stream<Integer> filteredStream = stream.filter(i -> i> 20);
		List<Integer> collect = filteredStream.collect(Collectors.toList());
		System.out.println(collect);
		
		list.stream().filter(i -> i> 20).forEach(i -> System.out.println(i));
		

	}

}
