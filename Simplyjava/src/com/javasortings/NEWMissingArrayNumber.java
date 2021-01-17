package com.javasortings;

public class NEWMissingArrayNumber {

	public static void main(String str[]) {
		int list[] = {-1,0,1,2,4,5};
		int sum = 0;
		int sum1 = 0;
		for(int i = 0 ; i < list.length ; i++) {
		sum = sum + list[i];
		}
		System.out.println(sum);
		
		for(int j = -1 ;j<=5;j++) {
			sum1= sum1+j;
			
		}
		System.out.println(sum1);
		
		sum = sum1-sum;
		System.out.println(sum);
		
	}

}
