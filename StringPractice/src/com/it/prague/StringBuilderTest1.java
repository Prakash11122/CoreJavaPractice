package com.it.prague;

public class StringBuilderTest1 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("prague").append("solution").reverse().insert(2, "mmm").delete(3, 5);
		
        System.out.println(sb);

	}

}
