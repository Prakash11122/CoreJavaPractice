//write a program to multiply 2 no's using functional interface
package com.it.codedecode;

public class Question2 {

	public static void main(String[] args) {
	MultiplyNum multiply = 	(a,b)-> System.out.println("Multiplication: " + (a * b));
	multiply.mul(10, 10);
	}

}
