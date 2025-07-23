package com.it.prauge;

 class A {
	
	int x = 10;
	void show() {
		System.out.println(" A class");
	}

}

class SingleInheritance extends A {
	int y = 20;
	void print() {
		System.out.println("B class");
	}
	
	public static void main(String[] args) {
		SingleInheritance si = new SingleInheritance();
		System.out.println(si.x);
		si.show();
		System.out.println(si.y);
		si.print();
	}
}
