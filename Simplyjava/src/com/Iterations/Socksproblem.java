package com.Iterations;

import java.util.HashSet;
import java.util.Set;

public class Socksproblem {

	public static void main(String str[]) {
	
	int arr[] = {1,5,1,5,1,3,3,2};
	System.out.println(getpair(arr));
	}
	public static  int getpair(int[] arr) {
		int number_ofpairs = 0;
		if(arr.length == 0) {
			return number_ofpairs;
		}
		Set<Integer> set = new HashSet<Integer>();
		for(int i =0 ;i<arr.length;i++) {
			if(!set.contains(arr[i])) {
  				set.add(arr[i]);
				
			}else {
				number_ofpairs++;
				set.remove(arr[i]);
				
			}
			
			

	}
	
	return number_ofpairs;
	}
	

}
