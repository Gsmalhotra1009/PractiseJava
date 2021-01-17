package com.javapractise;

public class Armstrongnumber {

	//To check whether any positive number is an Armstrong number or not, 
	//you have to perform the summation of, three times multiplication of,
	//all the digits present in the number, if the summation result is equal
	//to the actual number then the number will be an Armstrong number,
	
	public static void main(String str[])
	{
		
		int i =153;
		int n=i;
		int modulus;
		int number=0;
		while(n!=0)
		{
		modulus = n%10;
		number = number + modulus*modulus*modulus;
		n = n/10;
		}
		
		System.out.println(number);
	
	}

}
