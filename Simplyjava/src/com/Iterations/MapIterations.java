package com.Iterations;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIterations {

	public static void main(String str[])
	{
		HashMap<String , Integer> map = new HashMap<String, Integer>();
		map.put("fox", 9);
		map.put("Rat", 7);
		map.put("Cat", 8);
		map.put("Cow", 13);
		map.put("Rabbit",12 );
		map.put("Lion", 17);
		map.put("Tiger", 15);
		map.put("Leopard", 1);
		map.put("Bear", 2);
		map.put("Dog", 10);
		
		
		//Iterating key - value along
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			
			System.out.println(entry.getKey() + " : " + entry.getValue());
			
	}
		
		//iteratating Key only
		
		for(String name : map.keySet())
		{
			System.out.println("The name of the animals are :- "  + name);
		}
		
		//Iterating value only
		
		for(Integer value : map.values())
		{
			System.out.println("The values are listed here  "  +  value);
		}
	
		//Iterating using iterator
		
		Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<String, Integer> entry = itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		
	}

}
