package com.it.pradhan.lambda;

import java.util.function.Consumer;

public class MethodRef {

	public static void main(String[] args) {
		Consumer<String> consumer = (smg)-> System.out.println("smg");
		consumer.accept("JAY JAGANNATH");  

	}

}
