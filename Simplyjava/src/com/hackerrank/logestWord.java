package com.hackerrank;

public class logestWord {

public static void main(String str[]) {
	
	String name = "g#$%%%%% hkgjgjgkjgkjgjgjg this jjesogj";
	String namesplit[] = name.split("\\s");
	
	int largest;

		
		for(int i = 1;i<namesplit.length;i++) {
			largest = namesplit[0].length();
			if(namesplit[i].replaceAll("[^a-zA-Z]", "").length() > largest) {
				namesplit[0] = namesplit[i+1];
			//System.out.println(namesplit[0]);
				
			}
		
		}
		System.out.println(namesplit[0]);
	}
}
