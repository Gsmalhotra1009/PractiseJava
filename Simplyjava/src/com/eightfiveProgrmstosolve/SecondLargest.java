package com.eightfiveProgrmstosolve;

public class SecondLargest {

public static void main(String str[]) {
	int number[]= {4,9,3,78,15,36,5,45};
	int largest = number[0];
	int secondlargest = number[0];
	
	for(int i=0;i<number.length;i++) {
		if(number[i]>largest) {
			 secondlargest = largest;
			largest = number[i];
		}else if (number[i]>secondlargest) {
			secondlargest = number[i];
			
		}
		}
		
		System.out.println(secondlargest);
		
	}
}

