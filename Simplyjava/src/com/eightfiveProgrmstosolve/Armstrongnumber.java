package com.eightfiveProgrmstosolve;

public class Armstrongnumber {

public static void main(String str[])

{
	int i = 153;
	int n;
	n=i;
	int modulus = 0;
	while(n!=0) {
		int number = n % 10;
		//modulus= modulus + number * number *number ;
		System.out.println(number);
		n = n/10;
	}
	}



}
