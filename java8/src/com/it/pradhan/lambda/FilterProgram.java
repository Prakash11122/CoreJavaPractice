package com.it.pradhan.lambda;

import java.util.stream.Stream;

public class FilterProgram {

	public static void main(String[] args) {

		User u1 = new User("Anuska", 25);
		User u2 = new User("siva", 20);
		User u3 = new User("pravati", 10);
		User u4 = new User("durga", 15);
		User u5 = new User("laxmi", 30);
		User u6 = new User("ashok", 29);

		Stream<User> stream = Stream.of(u1, u2, u3, u4, u5, u6);
		stream.filter(u -> u.getAge() >= 18 && u.getName().startsWith("A")).forEach(u -> System.out.println(u));
	}

}

class User {
	private String name;
	private int age;

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

}
