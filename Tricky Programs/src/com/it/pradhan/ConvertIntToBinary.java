//Java Program for Decimal to Binary Conversion

package com.it.pradhan;

import java.util.Scanner;

public class ConvertIntToBinary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int nextInt = sc.nextInt();
		
		
		String binaryString = Integer.toBinaryString(nextInt);
		
		System.out.println("Binary (using built-in method):" +binaryString);
		
		

	}

}
