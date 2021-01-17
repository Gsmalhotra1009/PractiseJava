package com.eightfiveProgrmstosolve;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicatecharacters {

	public static void main(String str[]) {
		String name ="Better Butter";
		char nameChar[] = name.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		
		for(Character alphabet : nameChar) {
			Integer count = map.get(alphabet);
			if(count==null) {
				map.put(alphabet, 1);
			}else {
					map.put(alphabet, ++count);
				}
			}
		
		Set<Entry<Character,Integer>> entryset = map.entrySet();
		
		for(Entry<Character, Integer> entry : entryset ) {
			if(entry.getValue()>1) {
				System.out.println(entry.getValue() + "times for "+entry.getKey());
			
			}
		}
		
		
		// Which value repeated how many times 
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
	}


