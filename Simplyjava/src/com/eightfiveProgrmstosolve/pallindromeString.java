package com.eightfiveProgrmstosolve;

public class pallindromeString {

	public static void main(String str[]) {
	
		
		
		String name = "Ndfitin";
	String reverseString ="";
	StringBuffer sb = new StringBuffer(name.length());

	for(int i=name.length()-1;i>=0;i--) {
		reverseString =reverseString + name.charAt(i);
		sb = sb.append(name.charAt(i));		
		
	}
	System.out.println(sb);
	
	 String newS = sb.toString();
	System.out.println(reverseString);
	if(name.equalsIgnoreCase(reverseString)) {
		Boolean b = true;
		System.out.println("This is fine");
	}
	else {
		Boolean b = false;
		System.out.println("This is false");
	}
	}
	}


