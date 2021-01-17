package com.eightfiveProgrmstosolve;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ProgrammingquestionsClub {

	public static void main(String str[]) {
	
		//Removing duplicates from a String 
		
		
		String name = "GundeepisaGoopersonandheisopentotalk";
		Set<Character> set = new LinkedHashSet<Character>() ;
		
		char[] namechar = name.toCharArray();
		for(Character singlechar : namechar) {
			set.add(singlechar);
			}
			Iterator<Character> it = set.iterator();
			while(it.hasNext()) {
				System.out.print(it.next());
			}
			System.out.println("  ");
			System.out.println("####################################################");
			//Duplicate word removal from String 
			Set<String> set1 = new LinkedHashSet<String>() ;
			String originalString = "He is is a wonderful player";
			String duprem[] = originalString.split("");
			for(String dupsingle : duprem) {
				
				set1.add(dupsingle);
			}
			Iterator<String> it1 = set1.iterator();
			while(it1.hasNext()) {
				System.out.print(it1.next());
			}
			
			//Second Highest salary 
			
			
			System.out.println("  ");
			System.out.println("####################################################");
			
			int number[] = {45,85,78,15,45,96,15,87};
			int largest = number[0];
			int second_largest = number[0];
			for(int i = 0;i<number.length;i++)
			{
				if(number[i]>largest) {
					second_largest = largest;
					largest=number[i];
					
				}	else if (number[i]>second_largest) {
					second_largest = number[i];
					
				}
				
				
			
				
				
			}
			System.out.println(second_largest);
			
			//Bubble sort 
			System.out.println("  ");
			System.out.println("####################################################");
			int bubblesort[] = {4,8,9,1,2,7,3,9,87,452,458,43};
			int size = bubblesort.length;
			for(int i =0;i<size;i++) {
				for(int j=1;j<size-i;j++) {
					if(bubblesort[j-1]>bubblesort[j]) {
						int temp = bubblesort[j-1];
						bubblesort[j-1] = bubblesort[j];
						bubblesort[j]  = temp;
						
					}
					
					for(int k =0 ;k<size;k++) {
						System.out.println(bubblesort[k]);
					}
				}
			}
			
			System.out.println("  ");
			System.out.println("####################################################");
			//Binary Search 
			int binArray[] = {1,7,9,11,45,75,77,87,98,115,116};
			int mid,low=0, high=binArray.length-1;
			int number_to_search = 75;
			while(low<high) {
				mid= low+high/2;
				if(number_to_search == binArray[mid]) {
					System.out.println("This is the number to binary searched  " + binArray[mid]  + " and the index is   " + mid );
					break;
				}
				else if(number_to_search >binArray[mid]) {
					low = mid+1;
				}else if(number_to_search <binArray[mid]) {
					high = mid-1;
				}
			}
			
			
			//Linear Search
			//Anagram
			System.out.println("  ");
			System.out.println("####################################################");
			
			int anagram = 153;
			int new_armstrong = anagram;
			int new_modulus1 =0;
			while(new_armstrong!=0) {
				int modulus2= new_armstrong % 10;
				 new_modulus1 = new_modulus1 + modulus2 * modulus2 * modulus2;
			System.out.println("New Anagram "+ new_modulus1);
			new_armstrong = new_armstrong / 10;
			
			
			
			//int Palindrome
			System.out.println("  ");
			System.out.println("####################################################");
			int palinnum = 151;
			int new_pailin = palinnum;
			int new_modulus =0;
			while(new_pailin!=0) {
				int modulus1 = new_pailin % 10;
				 new_modulus = new_modulus *10 +modulus1;
				 
				 new_pailin =	 new_pailin / 10;
			}
			System.out.println("New Pailindrome  " +  new_modulus);
			
			//Reverse of int  
			System.out.println("  ");
			System.out.println("####################################################");
			int anynumber = 56987895;
			int new_number = anynumber;
			while(new_number!=0) {
				int modulus = new_number % 10;
			
				System.out.print("New Reverse " +  modulus);
				new_number = new_number / 10;
			}
			
			
		}
	}
	}


