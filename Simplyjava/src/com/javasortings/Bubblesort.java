package com.javasortings;

public class Bubblesort {

	static int temp;
	
	
	public static void getBubblesort(int numbers[])
	{
		
		//{15,1,7,6,5,9,2,54,98,78};
		int count = numbers.length;
	int temp;
		for(int i = 0 ;i < count; i++ ) {
			for(int j = 1; j<count-i; j++)
			{
				if(numbers[j-1]>numbers[j]) {
					temp = numbers[j-1];
					numbers[j-1] = numbers[j];
					numbers[j] = temp;
				}
			}
			
		}
		
		
	}
	
	
	public static void printarray(int numbers[])
	{
		for(int number : numbers)
		{
			System.out.println(number + " " );
		}
	}
	
	
	
	
public static void main(String str[])
{
		int numbers[] = {15,1,7,6,5,9,2,54,98,78};
		
		getBubblesort(numbers);
		
		System.out.println("After the execution of the above method");
		
		printarray(numbers);

}
	
	
	}


