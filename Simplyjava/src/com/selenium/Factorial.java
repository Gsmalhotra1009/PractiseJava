package com.selenium;

import java.util.Scanner;

public class Factorial {
	
	private static Scanner sc;

	public static void main(String str[])
	{
		sc = new Scanner(System.in);
		int num=sc.nextInt();
		int digit=1;
		
		for(int i=num;i>=1;i--)
		{
			digit=digit*i; 
		}
		System.out.println("the fibnocci of the no is " + digit);
	}

}
