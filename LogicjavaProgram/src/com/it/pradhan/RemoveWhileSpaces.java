package com.it.pradhan;

public class RemoveWhileSpaces {

	public static void main(String[] args) {
		String str = "  i lo ve ja  va progra  mming  ";

		String replaceAll = str.replaceAll("\\s", "");

		System.out.println(replaceAll);

	}

}
