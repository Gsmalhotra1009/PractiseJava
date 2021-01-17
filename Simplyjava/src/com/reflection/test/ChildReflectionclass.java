package com.reflection.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class ChildReflectionclass {
static String name = "";
	public static void main(String str[]) throws NoSuchMethodException, SecurityException {
/*	ParentNormalClass	pnc = new ParentNormalClass();
	Class cls = pnc.getClass();
	Constructor constructor = cls.getConstructor();
	Method[] methods = cls.getMethods();
	for(Method method : methods) {
		System.out.println(method.getName());
	}
	}*/
	 
	//To complete the code on this line
	//https://www.geeksforgeeks.org/reflection-in-java/

/*	String strname = "Gundeep";
	StringBuilder sbr = new StringBuilder(strname);
//	System.out.println(sbr.reverse());
	for(int i =strname.length()-1;i>=0;i--)
	{
	name = name + strname.charAt(i);
	
	}
	
	System.out.println("Working fine  " + name);

	}*/
	
	//Linear sort 
		
		int values[] = {4,3,45,75,15,65,8};
	int key;
		for(int j =1;j<=values.length;j++)
		{		
	key = values[j];
	int i = j-1;
	while((i>-1) && (values[i]>key)){
		values[i] = values[i+1];
		i--;
		
	}
	values[i+1]= key;
		}
		
		//Merge sort is Divide and conquer
		
		
	
	
	}
	
	
	
	
}
