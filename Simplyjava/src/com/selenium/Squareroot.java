package com.selenium;

import java.util.Scanner;

public class Squareroot 
{
	private static Scanner sc;

	public static void main(String str[])
	{
		sc = new Scanner(System.in);
		int num=sc.nextInt();
		int squareroot=0;
		for(int i=1;i<=num;i++)
		{
			squareroot=squareroot+num;
		}
		
		System.out.println("Square root of the no is:- " + squareroot);

		
	}
	
		
	

}
