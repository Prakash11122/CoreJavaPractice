//Task : WAJP to print numbers from 1 to 5 using Thread with the help of Runnable interface
package com.it.pradhan;

public class Demo implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i<=5; i++) {
			System.out.println(i);
		}
		
	}
	
	public static void main(String[] args) {
		Demo d = new Demo();
		Thread td = new Thread(d);
		td.start();
		
		
	}

}
