package com.pyramids;

public class DiamondPyramid {

	public static void main(String str[]) {
/*
		*
	   * *  
	  * * *
    * * * * *
   * * * * * * 
   
  */ 
		int n= 6;
		int space = n-1;
		
		for(int i= 0 ;i<6;i++) {
			//System.out.println();
			for(int j= 0;j<space;j++) {
			System.out.print(" ");
			}
			 for (int j = 0; j <= i; j++) {
	                System.out.print("* "); 
	      
	            System.out.print("\n"); 
	            space--; 
	        } 
		}
		
		
		
	}
	
	
	}


