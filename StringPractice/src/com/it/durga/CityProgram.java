package com.it.durga;

import java.util.Scanner;

public class CityProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your city name: ");
		String name=sc.nextLine().toLowerCase().trim();
		
		if (name.equals("odisha")) {
			System.out.println("JAY JAGANNATH");
		}
		else if(name.equals("chennai")) {
			System.out.println("Hello madrasi, vanakkam");
		}else if(name.equals("hyderabad")) {
			System.out.println("Hello Hyderabady, Aadaab");
		}else if(name.equals("banglore")) {
			System.out.println("Hello kanaddiga, Namaskar");
		}
		else {
			System.out.println("please enter a valid city name...");
		}
		

	}

}
