package com.it.pradhan.allTopic;

import java.util.Scanner;

public class GetInputFromUser {
	public static void main(String[] args) {

		int a;
		float f;
		String s;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string");
		s = sc.nextLine();
		System.out.println("you entered string " + s);

		System.out.println("enter a number");
		a = sc.nextInt();
		System.out.println("you entered number " + a);

		System.out.println("enter a float");
		f = sc.nextFloat();
		System.out.println("you entered float " + f);

	}

}
