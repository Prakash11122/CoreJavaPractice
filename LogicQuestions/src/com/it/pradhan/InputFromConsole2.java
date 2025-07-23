package com.it.pradhan;

import java.util.Scanner;

public class InputFromConsole2 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("Enter a String:" +s);
		
		int  i = sc.nextInt();
		System.out.println("Enter a int:" +i);
		
		
		float f = sc.nextFloat();
		System.out.println("Enter a float:" +f);
	}

}
