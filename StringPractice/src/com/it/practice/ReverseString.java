package com.it.practice;

public class ReverseString {

	public static void main(String[] args) {
		String str = "i.like.this.program.very.much";
	    String[] split = str.split("\\.");
	    
	    StringBuilder sb=new StringBuilder();
	    for(int i=split.length-1;i>=0;i--) {
	      sb.append(split[i]);
	      if(i!=0) {
	        sb.append(" ");
	      }
	    }
	    
	    System.out.println(sb.toString());

	}

}
