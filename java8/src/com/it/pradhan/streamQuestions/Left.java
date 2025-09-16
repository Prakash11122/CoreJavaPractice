package com.it.pradhan.streamQuestions;

public interface Left {
	default void m1() {
		System.out.println("m1 default method in left interface");
	}
	void m2();

}
