package com.javapractise;

import java.util.Scanner;

public class Primenumber {

public static void main(String str[])	

{
	//Scanner sc=new Scanner(System.in);
	//int number=sc.nextInt();
	System.out.println(isprime(5));
	}
	

public static boolean isprime(int number)

{
	int sqrt=(int)Math.sqrt(number)+1;
	for(int i=2;i<sqrt;i++)
		if(sqrt%i==0)
		{
			return false;
			
		}
	
	return true;
	
	}

}

