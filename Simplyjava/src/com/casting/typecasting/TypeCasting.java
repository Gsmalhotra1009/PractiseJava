package com.casting.typecasting;

public class TypeCasting {

	public static void main(String str[]) {
		
		//Widening casting = byte>>short>>char>>int>>long>>float>>double
		byte b = 4;
		int i = b;
		
		
		
		
		//Narrowing casting is the reverse of above 
		
		double d = 4.45;
		int k = (int)d;
		System.out.println(k);
		
		//converting char type in int
		
		char c = '1';
		int m = Integer.parseInt(String.valueOf(c));
		System.out.println(m);
		
		
	}
	 
		//converting int to String
	int l = 45;
	String val = String.valueOf(l);
}
