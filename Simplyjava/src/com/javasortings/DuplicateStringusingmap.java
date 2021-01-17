package com.javasortings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateStringusingmap {	
	//Find duplicacy by for normal method
	public void getduplicateStringusingforloop(String names[])	{
		for(int i=0; i<names.length;i++)
			for(int j=i+1; j<names.length ; j++){
				if(names[i]==names[j])	{
					System.out.println("Duplicacy found " + names[i]);
				}
			}
		}
	
	
	
	//Find duplicacy using Set
	
	public void getDuplicacyUsingSet(String names[])
	{
		Set<String> set = new HashSet<String>();
	for(String name: names)
	{
		if(set.add(name) == false)
		{
			System.out.println("Dulicacy found " + name );
		}
		
		
	}
	}
	
	
	
	
	//Find duplicacy using map 
	public void getduplicateString(String names[]) {
	
		HashMap<String, Integer> storemap = new HashMap<String,Integer>();
		for(String name : names) {
		Integer count = storemap.get(name);
		if(count == null)
		{
			storemap.put(name, 1);
			
		}else
		{
			storemap.put(name, ++count);
		}
		}
		
		
		Set<Entry<String, Integer>> entryset= storemap.entrySet();
		for(Entry<String, Integer> entry : entryset)
		{
			if(entry.getValue()>1)
			{
				entry.getKey();
				System.out.println("Duplicacy found " +  entry.getKey());
			}
		}
		
		
		
	}
	
	// FInd duplicacy count using map
	
	public void getduplicatecount(String names[]) {
	
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(String duplicate : names)
		{
			if(map.containsKey(duplicate))
			{
				map.put(duplicate, map.get(duplicate)+ 1);
			}else{
				map.put(duplicate, 1);
			}
		}
		
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " :- "  + entry.getValue());
			
		}
		
		
	}
	
	
	
	
	
	
	public static void main(String str[])
	
	{
	String names[] = {"Gundeep", "Rahul", "Josh", "Kansos" , "Saroj", "Gundeep" };
		DuplicateStringusingmap dsu = new DuplicateStringusingmap();
		dsu.getduplicateString(names);
		dsu.getduplicateStringusingforloop(names);
		dsu.getDuplicacyUsingSet(names);
		dsu.getduplicatecount(names);
	}
	
	
	
	
	}


