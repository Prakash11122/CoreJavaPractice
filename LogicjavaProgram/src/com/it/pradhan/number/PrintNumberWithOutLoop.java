// Print 1 to 100 Without Using for/while/do-while Loop in Code || Using Recursive

package com.it.pradhan.number;

import java.util.stream.IntStream;

public class PrintNumberWithOutLoop {

	public static void main(String[] args) {
		//printnum(1);
		printNumber(1, 100);
		
		IntStream.range(0, 101).forEach(e ->System.out.println(e));

	}

	public static void printnum(int num) {
		if (num <= 100) {
			System.out.println(num);// 1 2 3
			num++;
			printnum(num);
		}
	}
	
	public static void printNumber(int stNum, int endNum) {
		if(stNum <= endNum) {
			System.out.println(stNum);
			stNum++;
			printNumber(stNum, endNum);
			
		}
	}

	
}
