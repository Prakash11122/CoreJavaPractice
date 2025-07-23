package com.it.pradhan.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstDemo {
	public static void main(String[] args) {
//		Stream<Integer> of = Stream.of(1, 2, 3, 4);
//		System.out.println(of);
//		of.forEach(System.out::println);

		ArrayList<String> names = new ArrayList<>();
		names.add("Devid");
		names.add("josh");
		names.add("jon");
		names.add("killer");
		names.add("millor");

		// Stream<String> stream = names.stream();
//		stream.forEach(System.out::println);
		// approch 1 using forEach terminal operation
//		List<String> collect = stream.collect(Collectors.toList());
//		System.out.println(collect);

		// approch 2 using collect terminal operation
		List<String> collect = names.stream().collect(Collectors.toList());
		System.out.println(collect);
		
		// approch 3 using toArray() terminal operation
		String[] array = names.stream().toArray(String[]::new);
		System.out.println(Arrays.toString(array));
		
		//approch 3 Using count()
		long count = names.stream().count();
		System.out.println(count);

	}
}
