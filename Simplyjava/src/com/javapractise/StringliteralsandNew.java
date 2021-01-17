package com.javapractise;

public class StringliteralsandNew {
	
	public static void main(String str[]) {

	String name = "Gundeep";
	String new_name = "Gundeep";
	
	boolean b = name == new_name;
	System.out.println(b);
	
	boolean b3 = name.equalsIgnoreCase(new_name);
	System.out.println(b3);
	
	
	String name_newliteral = new String("Gundeep");
	boolean b1 = name == name_newliteral;
	System.out.println(b1);
	
	
	boolean b2 = name.equalsIgnoreCase(name_newliteral);
	System.out.println(b2);
	
	
	boolean b4 = new_name == name_newliteral;
	System.out.println(b4);
	
	}
}
