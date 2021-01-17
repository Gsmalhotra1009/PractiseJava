package com.javasortings;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class OrderedMap {

	public static void main(String str[]){
		
		Map<Integer, String> hashmap = new HashMap<Integer, String>();
	Map<Integer, String> treemap = new TreeMap<Integer, String>();
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		
		getmap(hashmap);
		//getmap(treemap);
	//	getmap(linkedHashMap);
	}
	
	public static void getmap(Map<Integer, String> map) {
	
		map.put(9, "fox");
		map.put(0, "Lion");
		map.put(7, "Dog");
		map.put(15, "Cat");
		map.put(8, "Anaconda");
		map.put(6, "Monkey");
		map.put(19, "Cow");
		map.put(1, "Rat");
		map.put(5, "Swan");
		map.put(90, "bear");
		
	for(Integer key : map.keySet()) {
		String value = map.get(key);
		System.out.println(key + ":" + value );
	}
		
	
	}

}
