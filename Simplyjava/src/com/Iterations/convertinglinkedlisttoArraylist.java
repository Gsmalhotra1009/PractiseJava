package com.Iterations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class convertinglinkedlisttoArraylist {

	public static void main(String str[]) {
		/*
		 * LinkedList<String> list = new LinkedList<>(); list.add("Apple");
		 * list.add("grapes"); list.add("mango"); list.add("Orange");
		 * list.add("pineapple"); list.add("banana"); Iterator<String> itr =
		 * list.iterator(); while(itr.hasNext()) { itr.next(); }
		 * 
		 * ArrayList<String> array = new ArrayList<String>(list);
		 * 
		 * 
		 * }
		 */

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("name", 1);
		map.put("Sanki", 2);
		map.put("Sanuj", 4);
		map.put("Shivam", 5);
		map.put("Rahul", 5);

		Set<Entry<String, Integer>> entry = map.entrySet();
		List<Entry<String, Integer>> elist = new ArrayList<Entry<String, Integer>>(entry);

		System.out.println(elist.toString());
		List<String> klist = new ArrayList<String>(map.keySet());
		System.out.println(klist.toString());
		List<Integer> entrylist = new ArrayList<Integer>(map.values());
		System.out.println(entrylist.toString());

	}

}
