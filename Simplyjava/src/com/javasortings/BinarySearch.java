package com.javasortings;

public class BinarySearch {

	  public static void main(String str[])

      {

             int number[] = {4,7,9,15,17,20,21,23,29,30,35};
             int low = 0;
             int high = number.length-1;
             int number_to_search= 23;
             
              while(low<=high) {
            	  int mid = (low+high)/2;
            	  if(number_to_search == number[mid]) {
            	  System.out.println("The text searched is found " + number[mid]);
            	 break;
            	 
            	 }else if(number_to_search > number[mid]) {
            		low = mid +1;  
            	  
            	  }else if (number_to_search < number[mid]) {
            		 high=mid-1; 
            	  }
            	  
            	  }
              }
             


     
}

	


