
//Write a Java program to compare two strings lexicographically , ignoring case differences



package com.it.sanfoundry;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your first string: ");
		String  str1 = sc.nextLine();
		
		
		
		System.out.println("Enter your second string: ");
		String str2 = sc.nextLine();
		
		int result = str1.compareToIgnoreCase(str2);
		
		if (result == 0) {
            System.out.println("The two strings are lexicographically equal, ignoring case.");
        } 
        // If result is negative, str1 is lexicographically less than str2
        else if (result < 0) {
            System.out.println("The first string is lexicographically less than the second string, ignoring case.");
        } 
        // If result is positive, str1 is lexicographically greater than str2
        else {
            System.out.println("The first string is lexicographically greater than the second string, ignoring case.");
        }

        // Close the scanner
        sc.close();

	}

}
