package com.it.pradhan;

import java.util.Scanner;

public class GrestedNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st number");
		int x = sc.nextInt();
		
		System.out.println("Enter 2st number");
		int y = sc.nextInt();
		
		System.out.println("Enter 3st number");
		int z = sc.nextInt();
		
		int largest;
		
		if (x >= y && x >= z)
			largest=x;
		
		else if(y>=x && y>=z)
			largest= y;
		else
			largest= z;
		
		System.out.println("The largest number is: " + largest);
		}

	

}
