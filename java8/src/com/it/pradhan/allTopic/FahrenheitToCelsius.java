package com.it.pradhan.allTopic;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		
		float  temperatue;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature");
		temperatue = sc.nextInt();
		temperatue = ((temperatue-32)*5)/9;
		System.out.println(temperatue);

	}

}
