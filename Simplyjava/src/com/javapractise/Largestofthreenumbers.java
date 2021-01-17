package com.javapractise;

public class Largestofthreenumbers {

	public static void main(String str[])
	{
		Largestofthreenumbers lr=new Largestofthreenumbers();
		lr.getthelargest(15, 19, 27);
		
	}
	public void getthelargest(int a, int b, int c)
	{
				
		if((a>b)&& (a>c))
		
		{
			System.out.println(a + " is greater " );
		}
		else if((b>a) && (b>c))
		{
			System.out.println(b+  " is greater ");
			
		}else if((c>a)&&(c>b))
		{
			System.out.println(c + " is greater");
		}
		
		
	}
	
	}


