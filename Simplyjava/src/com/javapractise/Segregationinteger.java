package com.javapractise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import net.sf.saxon.functions.Substring;

public class Segregationinteger 
{

	public static void main(String str[])
	
	{
		int arr[] = new int[] {1,0,1,1,1,0,0,0,1};
		//expected
		// 0,0,0,0, 1,1,1,1,
		//using hashmap
		//1,1,1,1,1,0,0,0,0
		
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++)
		{
			//System.out.println(arr.length);
			
			
		Arrays.fill(arr,0,4,1);
		Arrays.fill(arr,5,9,0);
			
			//System.out.println(Arrays.toString(arr));
		}System.out.println(Arrays.toString(arr));
		
		
		//
		
		
		

	}
	}
