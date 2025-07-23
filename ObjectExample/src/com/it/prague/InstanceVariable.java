package com.it.prague;

public class InstanceVariable {
	
	int x = 10;

	public static void main(String[] args) {
		
		
		//by using object
		System.out.println(new InstanceVariable().x );
		
		//by using object reference
		InstanceVariable iv = new InstanceVariable();
		System.out.println(iv.x);
		

	}

}
