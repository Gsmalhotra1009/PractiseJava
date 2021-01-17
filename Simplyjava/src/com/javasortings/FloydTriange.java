package com.javasortings;

public class FloydTriange {

	public static void main(String str[]) {
		int value =10;
		int number =1;
		for(int i =1 ;i<= value ;i++) {
			for(int j=1;j<=i ;j++) {
				
				System.out.print(number + " ");
				number ++;
			}
			System.out.println();
		}
		
		
	}

}
