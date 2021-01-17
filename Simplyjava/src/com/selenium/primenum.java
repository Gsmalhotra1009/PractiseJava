package com.selenium;

public class primenum {

	public static void main(String str[])
	{
		
		int num=43;
		boolean flag=false;
		for(int i=1;i<=num/2;i++)
		{
				if(num%i==0)
				{
					flag=true;
					break;
				}
		}
				if(!flag)
				{
		System.out.println(num + " is a prime no");
		
	}else 
	{
		System.out.println(num + " is a prime no");
	}
	}
		
		
	}
	

