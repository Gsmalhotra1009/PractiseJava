package com.selenium;

public class Calcexp 
{
	public static void main(String str[])
	{
		int i=10;
		int j=11;
		int result;
		char anycode='c';
		if(anycode=='a')
		{
			result=i+j;
			System.out.println(result);
			
		}else if(anycode=='b')
		{
			result= i-j;
			System.out.println(result);
		}else if(anycode=='c')
		{
			/*if(j!=0)//Both options are valid
			{
			result=i/j;
			System.out.println(result);
				
			}else 
			{
				result=0;
				System.out.println(result);
			}*/
			
			result=j!=0?i/j:0;//This is also valid 
			System.out.println(result);
			
		}
		
	}

}
