package com.javapractise;

import java.io.CharConversionException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.omg.PortableInterceptor.INACTIVE;

public class AnagramusingHashmap {
	public static void main(String str[]) {}
	int unsorted_Array[] = {100,19,45,4,9,87,56};
	
//Factorial of a number
	
	
//Anagram of a number 
//Fibbnoci sequence
//String Pallindrome
//Armstrong of a Number 
//integer pallindrome
//Socks Pairing
	public static int pairing(int[] pairing) {
		int number_of_pairs = 0;
		Set<Integer> set = new HashSet<Integer>();
		if(number_of_pairs == 0) {
			return number_of_pairs;
		}
		
		for(int i =0;i<pairing.length;i++) {
			if(!set.contains(pairing[i])){
				set.add(pairing[i]);
				
			}else {
				number_of_pairs++;
				set.remove(pairing[i]);
			}
		}
return number_of_pairs;
	}
	
	
//Duplicate Word from a String
//Largest word from a String
//Duplicate from the array
//Smallest Number from the Array
//Largest and Second Largest using single loop
//Replacing string without using third
//String Literals
//Reverse of a String
	
	
//Reverse without changing the special character
	public static void ChangewithoutSPlChartcter(char[] ch) {
		int small = 0;
		int large = ch.length;
		while(small<large) {
			if(!Character.isAlphabetic(ch[small])) {
				small++;
			}else if(!Character.isAlphabetic(ch[large])) {
				large--;
			}else {
				char temp = ch[small];
				ch[small] = ch[large];
				ch[large] = temp;
			
				
			}
		}
		
	}
	
	
//Prime Number 
//Missing Number from an Array
//Removal of an Array element to sort the array
	public static void sort_Array(int[] unsorted3) {
	int b1[] = new int[unsorted3.length];
	b1[0] = unsorted3[0];
	int l = 1;
	for(int i=1;i<unsorted3.length;i++) {
	if(b1[l-1]<unsorted3[i]) {
		b1[l] = unsorted3[i];
		l++;
	}
		
	}
	
	}
	
	
//Binary search
	public static void binarySearch(int[] sorted) {
	
		int number_tosearch = 25;
		int l = 0;
		int h = sorted.length-1;
		int mid;
		while(l<h) {
			mid = l+h/2;
		if(number_tosearch == sorted[mid]) {
			System.out.println("number is found"+ mid);
		}else if(number_tosearch > sorted[mid]) {
		 l = mid+1;		
		}else if(number_tosearch <sorted[mid]) {
			h = mid -1;
		}
				
	}
	}
	
	
	
//Bubble Sort
	public static void bubbleSearch(int[] unsorted1) {
	for(int i = 0;i<unsorted1.length;i++) {
		for(int j=1 ;j<unsorted1.length-i;j++) {
			if(unsorted1[j-1]>unsorted1[j]) {
				int temp  = unsorted1[j-1];
				unsorted1[j-1] = unsorted1[j];
				unsorted1[j] = temp;
			}
		}
		
	}}
	
//Linear sort
	public static void  linearSearch(int[] unsorted) {
	
	
	for(int j=1;j<unsorted.length;j++) {
	int	key = unsorted[j];
	int i = j-1;
	while((i>-1)&&(unsorted[i]>key)) {
		unsorted[i+1] = unsorted[i];
		i--;
		
	}
	key = unsorted[i+1];
		
		
		
	}}
	
//Balance Paranthsis
//Converting map to List
	public static void convertingHashToList() {
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		map.put("Mango", 1);
		map.put("Orange", 5);
		map.put("Apple", 4);
		Set<Entry<String, Integer>> entries = map.entrySet();
		List<Entry<String, Integer>> list3 = new ArrayList<Entry<String,Integer>>(entries);
		
		
		
		List<String> list = new ArrayList<String>();
		List<String> list1 = Arrays.asList("Gundeep", "Sam","Raj");
	}
	
//Excel Writing
//List sorting
//
		

		
		
		
		
		
		
}
