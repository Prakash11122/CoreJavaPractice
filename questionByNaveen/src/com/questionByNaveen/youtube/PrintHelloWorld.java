//Interview Question: Print Hello World without using semi colon (;) in Java
package com.questionByNaveen.youtube;

public class PrintHelloWorld {

	public static void main(String[] args) {

		if (System.out.printf("Hello world" + "\n") == null) {
		}

		if (System.out.append("hello world") == null) {
		}

		if (System.out.append("hello world").equals(null)) {
		}

		for (int i = 0; i < 1; System.out.println("hello word")) {
			i++;
		}

	}

}
