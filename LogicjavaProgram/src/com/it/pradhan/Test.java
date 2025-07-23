package com.it.pradhan;

public class Test {

	public static void main(String[] args) {
		Student st = new Student();
		st.id = 1;

		fun(st);
		System.out.println(st.id);

	}

	private static void fun(Student a) {
		Student st1 = new Student();
		st1.id = 2;
		a = st1;
	}

}

class Student {
	public int id;
}
