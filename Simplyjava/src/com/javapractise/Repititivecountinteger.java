package com.javapractise;

import java.util.Arrays;

public class Repititivecountinteger {

	public void getRepititiveIntegerCount(int[] rep)
	{
		int c[] = new int[6];
		Arrays.fill(c, 0);
		
		for(int i = 0 ; i < rep.length; i++){
			//System.out.println(rep.length);
		c[rep[i]]++;
		System.out.println(c[rep[i]]++);
		}
		
		for(int i = 0; i < c.length; i++){
			if(c[i] > 1){
			System.out.println("Repeated : "+i +" = "+ c[i] +" times");
			}
			}
			
		
	}
	
	
	
	
	
	public static void main(String str[])
	{
		int rep[] = new int[] {1,5,1,7,9,10};
		Repititivecountinteger repi = new Repititivecountinteger();
		repi.getRepititiveIntegerCount(rep);
	}

}
