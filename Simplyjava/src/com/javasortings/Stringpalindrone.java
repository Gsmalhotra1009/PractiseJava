package com.javasortings;

public class Stringpalindrone {

	public static String newtext="";
	
	public static String  getreverseString(String text)
	{
		int length = text.length();
	
		for(int i=length-1;i>=0;i--)
		{
			System.out.println(text.charAt(i));
			newtext= newtext+text.charAt(i);
			System.out.println(newtext);
			
			
			
		}
		System.out.println(newtext);
		return newtext;
		
		}
			public static boolean comparisionArmstrong(String text)
	{
		if(text.equalsIgnoreCase(getreverseString(text)))
		{
			return true;
		}else {
			
			return false;
		}
		
	
		}
	
	
	
	
	public static void main(String str[])
	{
		String name ="Bob" ;
		//getreverseString(name);
		
	comparisionArmstrong(name);
		
	}

}
