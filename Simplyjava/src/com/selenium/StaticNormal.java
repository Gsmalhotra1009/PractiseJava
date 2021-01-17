package com.selenium;

public class StaticNormal {

 String name= "Rahul";	
	static int age=5;
	
	public void getcharacter(String s,int i)
	{
	name=s;
	age=i;
	getdetails();
	}
	
	public static int getdetails()
	{
		int x=5;
		int y=7;
		
		return x+y;
	}
public static void main(String str[])
{
	StaticNormal sn=new StaticNormal();
	sn.getcharacter("Raj", 45);
	
	}
}
