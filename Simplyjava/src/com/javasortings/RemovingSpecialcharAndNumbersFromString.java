package com.javasortings;

import java.util.Arrays;

public class RemovingSpecialcharAndNumbersFromString {

	public static void main(String str[])
	{
		//Below is to use to remove the special characters and numbers from the String 
		
		String name1 = "Gu@#$nde&%$#^*e15979p";
		name1 = name1.replaceAll("[^a-zA-Z]", "");
		System.out.println(name1);
		
		//Below is the code which removes special characters only from the code
		
		String name2  = "Gu@#$nde&%$#^*e15979p";
		name2 = name2.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(name2);
		
		
		//This is a Concept of immutable as we know that String will create a new object here on 
		//concatinating it actgually changes to new String object
		String frstname = "Gundeep";
		concat(frstname);
		System.out.println(frstname);
		
		
		
	}
	
	public static void concat(String frstname) {
		frstname = frstname + "Singh";
		//System.out.println(frstname);
		
		int arrysFill[] = {1,0,1,1,0,0,0,1,1,0,1,0,1,0};
	//	counting number of 1
int count=0; 

		for(int i =0 ;i<arrysFill.length;i++) {
			if(arrysFill[i]==1) {
			count++;
			}
			
		}
		System.out.println(" This is the total count :-  "+ count);
		
		Arrays.fill(arrysFill,0,count,1);
		Arrays.fill(arrysFill,count,arrysFill.length,0);
		System.out.println(Arrays.toString(arrysFill));
		
	}
	
}
