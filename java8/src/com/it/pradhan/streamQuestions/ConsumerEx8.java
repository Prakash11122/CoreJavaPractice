package com.it.pradhan.streamQuestions;

import java.util.function.Consumer;

public class ConsumerEx8 {

	public static void main(String[] args) {
		Consumer<String> c = s -> System.out.println("Hey bro");
		c.accept(null);

	}

}
