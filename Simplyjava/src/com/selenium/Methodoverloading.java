package com.selenium;

public class Methodoverloading {

	int i=8;
	public static void main(String str[])
		{
			Methodoverloading ml=new Methodoverloading();
			ml.getsum(15);
			ml.getsum();
		}

public void getsum()
{
	
	System.out.println(i+ "There is no value to get the sum");
	this.getsum(15);
	}

public void getsum(int i)
{
	
	System.out.println(i);
	
	}

}


