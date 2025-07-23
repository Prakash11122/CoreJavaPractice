package com.pratap;

public class SumOfNumber {

	public static void main(String[] args) {
		int num=1234;
		int total=0;
	    while(num>0) {
	    total+=num%10;
	    num/=10;
	    }
		System.out.println(total);

	}

}
