package com.Iterations;

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicatefromArray {

	public static void main(String str[]) {
		
		String names[] = {"Rahul","Shivam","Shubham","Mukti","Mukti","Rajshere"};
		Map<String , Integer> map = new LinkedHashMap<String,Integer>();
		for(String name : names ) {
			Integer count = map.get(name);
			if(count == null) {
				map.put(name, 1);
			}
			else {
				map.put(name, ++count);
			}
		}
		
		for(String x : map.keySet()) {
			
		
			if(map.get(x)>1) {
				System.out.println(x + "  " + map.get(x));
			}
		}
		
	}

}
