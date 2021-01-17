package com.javasortings;

public class IntegerPalindrome {

public static int reverse =0;
	
public static void main(String str[])
	{
		int number = 121;
		int pallindrome=number;
		while(pallindrome!=0)
			
		{
			int remainder = pallindrome % 10;
			reverse = reverse * 10 + remainder;
			pallindrome = pallindrome / 10;
			
		}
		
		if (reverse == number)
		{
			System.out.println("No is pallindrome");
		}else {
			System.out.println("No is not Pallindrome");
		}
		
	
	}
		
	}


