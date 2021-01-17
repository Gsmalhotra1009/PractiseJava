package com.javasortings;

public class SwappingIntegerValuewithoutsusingTHirdVAr {

	public static void main(String str[]) {
		
		int x = 10;
		int y = 5;
		
		// y = 10; x= 5;
		x = x+y;
		y= x-y;
		x = x-y;
		System.out.println(x + "  " +  y);
		
	}

}
