package com.it.bealdung;

public class ExampleCompareTo {

	public static void main(String[] args) {
		String author = "author";
		String book = "book";
		String duplicateBook = "book";
		
		
//		System.out.println(author.compareTo(duplicateBook));
//		System.out.println(book.compareTo(duplicateBook));
		
		System.out.println(author.compareToIgnoreCase(duplicateBook));

	}

}
