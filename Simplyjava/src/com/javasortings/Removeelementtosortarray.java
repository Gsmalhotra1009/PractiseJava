package com.javasortings;

public class Removeelementtosortarray {

public static void main(String str[]) {
	int unsorted[] = {7,5,9,6,11,15,18,4,12};
	getsortedarray(unsorted);
		
}

public static void getsortedarray(int unsorted[]) {
	
	int b1[] = new int[unsorted.length];
	b1[0] = unsorted[0];
	int l = 1;
	for(int i=1 ;i<unsorted.length;i++) {
		if(b1[l-1] < unsorted[i]) {
			b1[l] = unsorted[i];
			l++;
		}
	}

//for the sorted array
	
	for(int i = 0 ; i < b1.length ; i++)
	{
		System.out.println(b1[i]);
	}
}



}
