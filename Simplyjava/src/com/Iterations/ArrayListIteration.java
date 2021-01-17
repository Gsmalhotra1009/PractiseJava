package com.Iterations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteration {

	public static void main(String str[])
	{
		List<String> arraylist = new ArrayList<String>();
		arraylist.add("Rajesh");
		arraylist.add("Sanjna");
		arraylist.add("Sumesh");
		arraylist.add("Arush");
		arraylist.add("Varun");
		arraylist.add("Vedansh");
		arraylist.add("Bhanu");
		arraylist.add("Bhavesh");
		arraylist.add("Paras");
		
		/*System.out.println(arraylist.get(0) + "###############");
		
		
		//using Normal for loop 
		for(int i= 0 ; i < arraylist.size() ; i++)
		{
			System.out.println(arraylist.get(i));
		}
		
		//using advanced for loop 
		
		for(String name : arraylist) {
		System.out.print("\n");
		System.out.println(name);
		
		//using iterator 
		
		Iterator<String> itr = arraylist.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}*/
		
		
		
		
		Object names[] = arraylist.toArray();
		int l = names.length;
		
		String strnames[] = Arrays.stream(names).toArray(String[]::new);
							Arrays.toString(strnames);
							
							for(int i =0;i<strnames.length;i++) {
								System.out.println(strnames[i].toString());
							}
		
		
		
		//Linked List 
		
		
							
	
							
		
		
	}

}
