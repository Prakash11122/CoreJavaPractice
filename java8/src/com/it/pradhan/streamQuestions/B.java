package com.it.pradhan.streamQuestions;

public class B {
	public static void main(String[] args) {
		A a = new A() {
			public int square(int x) {
				return x*x;
			};
			
		public int add(int... values) {
			System.out.println(values.getClass().getTypeName());
			int res = 0;
			for(int ele : values) {
				res += ele;
			}
			return res;
		};
			
		};
		
		System.out.println("Square of a number: " + a.square(10));
		
		System.out.println("Addition of numbers: " + a.add(1,2,3,4));
		
//		A aa = x -> x*x;
//		int square = aa.square(11);
//		System.out.println(square);
		
	}

}
