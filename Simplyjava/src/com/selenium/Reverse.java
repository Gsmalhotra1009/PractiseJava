package com.selenium;

public class Reverse {
	
	public static void main(String str[])
	{
		int num=1001;
		int reversed=0;
		int value=num;
		while(value!=0)
	{
		int digit=value%10;
		reversed=reversed*10+digit;
		value/=10;
			
	}
	System.out.println(reversed + " is the reversal of the " + num );
	if(reversed==num)
	{
		System.out.println(reversed + " is a palindrome");
	}else
	{
		System.out.println(reversed + " is not a palindrome");
	}
	
	
	}

}


