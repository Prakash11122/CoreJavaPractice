package com.it.durga.oops;

abstract class Vehicle {
	public abstract int getNoOffWheel(); 

}

class car extends Vehicle{

	@Override
	public int getNoOffWheel() {
		
		return 4;
	}
	
}

class Auto extends Vehicle{

	@Override
	public int getNoOffWheel() {
		// TODO Auto-generated method stub
		return 3;
	}
	
}


class Test{
	public static void main(String args[]) {
		car c = new car();
		System.out.println(c.getNoOffWheel());
		
		Auto au = new Auto();
		System.out.println(au.getNoOffWheel());
	}
}
