package com.it.pradhan.streamQuestions;

public class ThreadExampleimpl {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new ThreadExample());
		thread1.start();
		
		ThreadExample2 thread2 = new ThreadExample2();
		thread2.start();

	}

}
