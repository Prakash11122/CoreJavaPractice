//find sum of digits of a number 12344

package com.pratap;

public class SumOfDigits {

	public static void main(String[] args) {
		int sum = 12344;
		int total=0;
		
		while(sum>0) {
			total = total+sum%10;
			sum = sum/10;
		}
		System.out.println("sum of number is: "+total);

	}

}
