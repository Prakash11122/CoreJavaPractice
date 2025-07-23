//print name with its length which are starting with 'A' using Stream API

package com.it.pradhan.map;

import java.util.Arrays;
import java.util.List;

public class MapTask {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ashok", "Anil", "Raju", "Rani", "John", "Akash", "Charles");
		names.stream().filter(name -> name.startsWith("A"))
		.map(name -> name + "-" + name.length())
		.forEach(name -> System.out.println(name));

	}

}
