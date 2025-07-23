package com.it.pradhan.stream;

import java.util.Arrays;
import java.util.List;

public class NameFilter {

	public static void main(String[] args) {

		List<String> asList = Arrays.asList("John", "Anushka", "Anupama", "Smith", "Ashok");
		//asList.stream().filter(i -> i.startsWith("A")).forEach(System.out::println);
		asList.stream().filter(i -> i.startsWith("A")).forEach(i ->System.out.println(i));
		/*List<String> collect = asList.stream().filter(i -> i.startsWith("A")).collect(Collectors.toList());
		System.out.println(collect);
		List<String> collect2 = asList.stream().filter(i ->i.endsWith("a")).collect(Collectors.toList());
		System.out.println(collect2);*/

	}

}
