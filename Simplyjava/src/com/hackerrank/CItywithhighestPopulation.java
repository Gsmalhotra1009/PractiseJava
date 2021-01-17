package com.hackerrank;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CItywithhighestPopulation {

	public static HashMap<String, Integer> getmap(){
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		map.put("Delhi", 456987);
		map.put("Noida", 456985);
		map.put("Chandigarh", 451562);
		map.put("Faridabad", 756326);
		map.put("Gurgaon", 456987);
	
		return map;
	}
	
	public static void main(String str[]) {
	
		//System.out.println(getmap().size());
		int maxum =Collections.max(getmap().values());
		
	//System.out.println(maxum);
	
	//Set<Entry<String,Integer>> entries = getmap().entrySet();
	for(Entry<String,Integer> entry : getmap().entrySet() ) {
		if(maxum == entry.getValue()) {
			System.out.println(entry.getKey());
		}
	}
	
}
		
		
	

}
