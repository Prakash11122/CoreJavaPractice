

//5. Write a Java program to compare two strings lexicographically Two strings are 
//lexicographically equal if they are the same length and contain the same characters in the
//same positions

package com.it.sanfoundry;

public class Test5 {
	
	

	public static void main(String[] args) {
		String str1 = "Durga";
		String str2 = "Durga";
		System.out.println("string 1 : " + str1);
		System.out.println("string 2 : " + str2);
		int res =str1.compareTo(str2);
		
		if(res<0) {
			System.out.println("String 1" +" is less than " + "String 2");
		}
		else if(res == 0){
			System.out.println("String 1 "+"is equal to " +"String 2");
		}
		else
		{
			System.out.println("String 1 "+"is greater than " +"String 2 ");
		}
		
		

	}

}
