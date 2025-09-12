package com.it.pradhan.streamQuestions;

public class ThreadExample2 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<10;i++) {
			System.out.println("second child");
		}
		
	}

}
