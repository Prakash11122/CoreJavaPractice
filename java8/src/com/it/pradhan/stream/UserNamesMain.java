package com.it.pradhan.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserNamesMain {

	public static void main(String[] args) {
		User u = new User("devid",30);
		User u1 = new User("jon",10);
		User u2 = new User("rishi",21);
		User u3 = new User("akash",18);
		User u4 = new User("dinesh",25);
		
		Stream<User> userRef = Stream.of(u,u1,u2,u3,u4);
		//userRef.filter(user -> user.getAge() > 18).forEach(user -> System.out.println(user));
		//userRef.filter(user -> user.getAge()<18).forEach(System.out::println);
		List<User> collect = userRef.filter(user -> user.getAge()<18).collect(Collectors.toList());
		System.out.println(collect);
		
		

	}

}
