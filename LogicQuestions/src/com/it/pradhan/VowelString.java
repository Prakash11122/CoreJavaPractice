//3. Write a Java program to check if a vowel is present in a string.

package com.it.pradhan;

public class VowelString {
	
	public static void main(String[] args) {
		System.out.println(stringContainsVowels("Hello")); // true
		System.out.println(stringContainsVowels("TV")); // false
	}
	
	public static boolean stringContainsVowels(String input) {
		return input.toLowerCase().matches(".*[aeiou].*");
	}

}
