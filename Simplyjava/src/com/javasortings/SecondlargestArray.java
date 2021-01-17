package com.javasortings;

public class SecondlargestArray {

	
	public static void main(String str[])
	{
		
		// First way to solve the second largest using function
	int first;
	int second;
		int arr[]= {1,5,9,4,6,9,3,210,890,456};
		
		 first= second= Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>first)
			{
				second = first;
				first = arr[i];
			}
			
			else if (arr[i]>second && arr[i]!=first)
			{
				second = arr[i];
				
			}
		
		}
			if(second == Integer.MIN_VALUE)
			{
				System.out.println("There is no second largest");
			}
			else {
				System.out.println("second largest number is " + second);
			}
		
	// Second way to solve the program without using any function
			
			int largest = arr[0];
			int secondLargest = arr[0];
			
			for(int i = 1 ; i < arr.length ; i ++)
			{
				if(arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
				}else if(arr[i] > secondLargest) {
					
					secondLargest = arr[i];
				}
			}
	System.out.println("The second largest number is " + secondLargest);
	
	}
	}
	

