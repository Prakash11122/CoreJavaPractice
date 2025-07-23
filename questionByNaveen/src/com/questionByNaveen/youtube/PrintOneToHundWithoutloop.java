package com.questionByNaveen.youtube;

public class PrintOneToHundWithoutloop {

	public static void main(String[] args) {
		printnum(1, 100);

	}

	public static void printnum(int num) {
		if (num <= 100) {
			System.out.println(num);// 1,2,3....
			num++;
			printnum(num);
		}
	}

	public static void printnum(int stnum, int endnum) {
		if (stnum <= 100) {
			System.out.println(stnum);// 1,2,3....
			stnum++;
			printnum(stnum, endnum);
		}
	}

}
