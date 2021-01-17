package com.javapractise;

public class replacingstringnotusing3variable {

	public static void main(String str[])
	{
		//substring(int startindex)-- it means it does not count the initial values r
		//substring(int initialindex,int endindex-1), it only counts values ranging in between them
		String string1="Gundeep";
		String string2="Singh";
		string1=string1+string2;
		
System.out.println(string1);
string2=string1.substring(0, string1.length()-string2.length());
System.out.println(string2);
System.out.println(string1);
string1=string1.substring(string2.length());
System.out.println(string1);


	}


}


