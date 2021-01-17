package com.javapractise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class duplicateusingmap {

	public static void getdulicate(String names[])
	{
	Map<String, Integer> storemap = new HashMap<String, Integer>();
	for(String name: names) {
		Integer count = storemap.get(name);
		
		 if(storemap.containsKey(name)) {
			 storemap.put(name, count+1);
		 } else {
				 storemap.put(name, 1);
			 }
		
	}
	
	for(Map.Entry<String, Integer> entry : storemap.entrySet()) {
		if(entry.getValue()>1)
		{
			System.out.println(entry.getKey() +" is  " +  entry.getValue()); 
		}
	}
	
	
		
	}
	
	
	
	

public static void main(String str[])
{
	String names[]= { "Gundeep", "Java", "Jav", "vishal", "Java", "studying" };	
	
	//duplicateusingmap dup = new duplicateusingmap();
	duplicateusingmap.getdulicate(names);
	
	
	}


}
