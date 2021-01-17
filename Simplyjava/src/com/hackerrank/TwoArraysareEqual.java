package com.hackerrank;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TwoArraysareEqual {

	public static void main(String str[]) {

		String name1[] = { "gfdfd", "Gundeep", "Singh", "Singh" };
		String name2[] = { "Singh", "Gundeep", "Singh", "gfdfd" };

		
	//	System.out.println(Arrays.equals(name1, name2));

		System.out.println(compareALL(name1, name2));
		System.out.println(comparelist(name1, name2));

	}

	public static boolean compareALL(String[] name1, String name2[]) {

		for (int i = 0; i < name1.length; i++) {
			for (int j = 0; j < name2.length; j++) {
				if (name1[i].equalsIgnoreCase(name2[j])) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	
	public static boolean comparelist(String[] name1,String name2[]) {
		List<String> list1  = new LinkedList<String>();
		for(String name : name1) {
			list1.add(name);
		}
		List<String> list2 = new LinkedList<String>();
		for(String name: name2)
		list2.add(name);
		
		return list1.containsAll(list2);
		
		
		
	}
	
	
	//

}
