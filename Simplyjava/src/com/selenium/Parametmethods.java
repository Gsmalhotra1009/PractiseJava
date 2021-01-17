package com.selenium;

public class Parametmethods {

	int a=56;
	  int b=76;
	  
	public static void main(String str[])
	{ 
		Parametmethods pm=new Parametmethods();
		pm.getvalues(45, 78);
		System.out.println("This is going big" + pm.getvalues(45, 78));
	}
	
	public int getvalues(int x, int y)
	
	{ 
		int result= x+y;
		return result;
	}
		
	

}
