package com.java8;

import java.util.Arrays;
import java.util.Comparator;

//Q1.Given a Sentence, find out the word that has the height length
public class Fohl {

	public static void main(String[] args) {
		

		String str = "I'm a rich person in this word";
		
		String string = Arrays
				.stream(str.split(" "))
				.max(Comparator.comparing(String::length))
				.get();
		System.out.println(string);
		
	}

}
