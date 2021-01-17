package com.javapractise;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String str[]) {
		String[] longComb = { "a" };
		System.out.println(getArraySequence(longComb));

	}

	public static String getArraySequence(String longComb[]) {

		String name = "";
//iterating each string value from the given array and passing to the method to compare the prefix 
		if (longComb.length == 1) {
			return longComb[0];
		} else {
			for (int i = 1; i < longComb.length; i++) {
				name = longestCommonPrefix(longComb[i - 1], longComb[i]);
				longComb[i] = name;

				if (name.equalsIgnoreCase("")) {
					break;
				}

			}
			return name;
		}
	}

	public static String longestCommonPrefix(String a, String b) {

		//Comparing two values and figure out the common prefix of them
		
		String new_name = "";
		boolean flag = true;
		for (int i = 0; i < a.length(); i++) {
			if (flag) {
				for (int j = i; j < b.length(); j++) {
					if (a.charAt(i) == b.charAt(j)) {
						new_name = new_name + a.charAt(i);
						flag = true;
						break;
					} else {
						flag = false;
						break;
					}

				}
			} else {
				break;
			}

		}

		
		return new_name;
	}
}

