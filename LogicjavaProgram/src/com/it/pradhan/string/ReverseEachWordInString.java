package com.it.pradhan.string;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		String output = "";
		String input = "java code";
		System.out.println("Original String:"+ input);

		String[] words = input.split(" ");

		for (String word : words) {
			String revword = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				revword = revword + word.charAt(i);
			}
			output = output + revword + " ";
		}
		System.out.println(output);

	}

}
