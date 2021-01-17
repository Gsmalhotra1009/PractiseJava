package com.javasortings;

public class Insertionsort {

	public static void getInsertionSorting(int numbers[])
	{


		
		int arraylength = numbers.length;
		for(int j=1;j<arraylength;j++)
		{
			int i = j-1;
			int key = numbers[j];
			
			while((i>-1) && (numbers[i]>key)){
				numbers[i+1] = numbers[i];
				i--;
			}
		
			numbers[i+1] = key;
			
		}
	
	}
	
	public static void main(String str[])
	{
		int numbers[] = {15,2,1,7,6,5,9,2,54,98,78};
		getInsertionSorting(numbers);
		for(int number : numbers)
		{
			System.out.println(number + " ");
		}
	}
	
	
	
	public static int[] num(int num[]) {
		return num;
	}
	
	
	
	}


