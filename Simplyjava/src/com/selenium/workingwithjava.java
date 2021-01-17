package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class workingwithjava

{

	public static void main(String str[])
	{
		//Type Casting
			long l=7;
			int i;
			i=(int)l;
			System.out.println(i);
			
		//Conditional Assignment
			int ca1=10;
			int ca2=5;
			System.out.println(ca1>ca2?ca1:ca2);
		
		//Block statement 
			int diff;
		
			if(ca1>ca2)
			{
				diff=ca1-ca2;
				System.out.println("ca1 is bigger" + diff);
			}else if(ca2>ca1)
			{
				diff=ca2-ca1;
				System.out.println("Ca2 is bigger" + diff);
			}else
			{
			System.out.println("Both are equal");
			}
		
		//Nested if- statements
		
		if(ca1>ca2)
		{
			if(ca1!=5)
			{
				String str1=":- Value must be ca2";
			System.out.println(ca2 + str1);
			}
		}else 
		{
			System.out.println("There is no difference ");
		}
			//Negation
				boolean done=false;
				if(!done)
				{
				System.out.println("keeping working hard");
				}
		//Conditional && and ||-- checks only right side if left side is true
				int students=40;
				int rooms=0;
				if(rooms>0 && students/rooms>0)//if we apply single & then it throws an error because offic
												//-ally we cannot divide with 0
				{
					System.out.println("find the rooms");
				}
	
	}
		
}

