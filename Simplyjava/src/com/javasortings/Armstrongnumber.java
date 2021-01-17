package com.javasortings;

public class Armstrongnumber {

	//153 is an Anagram 
	static int result= 0;
	
	
	public static int  getNumber(int armstrong)	{
		 	
		while(armstrong > 0)
		{
			int modulus = armstrong % 10;
			armstrong = armstrong / 10 ;
			int square = modulus * modulus *modulus ;
			result = square + result;		
		}		
		return result;
	}
	
	public static boolean comparisionArmstrong(int number)
	{
		if(number == getNumber(number))	{
			System.out.println("This is an Armstrong number");
			return true;
		}else {
			System.out.println("This is no an Armstron gnumber");
			return false;
		}
	}
	
	public static void main(String str[])
	{
		int value= 153;
		comparisionArmstrong(value);
		
	}

}
