package com.javapractise;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class delduparray {

	public static void main(String str[]) {
		// String name[]= new String[5];
		int counter = 0;

		String name2[] = { "Gundeep", "Java", "Jav", "vishal", "Java", "studying" };

		// old method using nested foor loop
		for (int i = 0; i < name2.length; i++) {
			for (int j = i + 1; j < name2.length; j++) {
				if (name2[i].equalsIgnoreCase(name2[j])) {
					System.out.println("*********** " + name2[i] + " this is the duplicate one");

				}

				// //using hashset

				Set<String> store = new HashSet<String>();// Set does not allow dkuplicat value
				for (String name : name2) {
					if (store.add(name) == false)// add functionality checks for the duplicacy
					{
						System.out.println("duplicate value is " + name);
					}
				}

				// using Hashmap

				Map<String, Integer> storemap = new HashMap<String, Integer>();
				for (String name : name2) {
					Integer count = storemap.get(name);
					if (count == null) {
						storemap.put(name, 1);

					} else {
						storemap.put(name, ++count);

					}

				}

				Set<Entry<String, Integer>> entryset = storemap.entrySet();
				
				
				
				for (Entry<String, Integer> entry : entryset) {
					if (entry.getValue() > 1) {
						System.out.println("duplicatgrge value is " + entry.getKey());
					}
				}

			}
		}

	}

}
