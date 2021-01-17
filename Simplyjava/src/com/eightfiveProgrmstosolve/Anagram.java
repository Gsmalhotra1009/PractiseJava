package com.eightfiveProgrmstosolve;

import java.util.Arrays;

public class Anagram {

public static void main(String str[]) {
	//Both the strings are Anagramms
	//Mother in law
	//Hitler women
	//Motherinlaw
	//Hitlerwomen
	
	String name1 = "Mother in law";
	String name2 = "Hitler women";
	
	name1 = name1.replaceAll("\\s", "");
	System.out.println(name1);
	name2 = name2.replaceAll("\\s", "");
	System.out.println(name2);
	
	boolean status = true;
	
	 if(name1.length() == name2.length()) {
		 System.out.println("They are of equal size");
		 char[] name1char = name1.toLowerCase().toCharArray();
		 char[] name2char = name1.toLowerCase().toCharArray();
		 Arrays.sort(name1char);
		 Arrays.sort(name2char);
		 status = Arrays.equals(name1char, name2char);
		 
	 }
	 if(status) {
		 System.out.println("They both are anagrams");
	 }else {
		 System.out.println("They are not ");
	 }
	 
	 // Trying other way to solve the problem
	 
	 
			
			
		}
	}


