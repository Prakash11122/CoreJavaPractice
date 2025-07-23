package com.it.pradhan;

import java.util.Scanner;

public class InputFromUser {
	
	public static void main(String[] args) {
		int num;
		
		System.out.println("enter a number");
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		System.out.println("enterd number is:"+num);
		sc.close();
	}

}
