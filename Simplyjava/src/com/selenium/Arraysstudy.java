package com.selenium;

public class Arraysstudy 
{
	public static void main(String str[]) 
	{
		try {
	int[] ar1=new int[3];
	ar1[0]=70;
	ar1[1]=90;
	ar1[2]=15;
	int sum=0;
	for(int i=0; i<ar1.length;i++)
	{
		sum+=ar1[i];
	}
//Enhanced for loop
System.out.println(sum);
}catch(Exception ex)
		{System.out.println("There is an error");
	}
		}
}
