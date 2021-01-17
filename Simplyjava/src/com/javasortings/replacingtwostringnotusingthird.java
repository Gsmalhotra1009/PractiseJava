package com.javasortings;

public class replacingtwostringnotusingthird {

	public static void main(String str[]) {
		
		String string1 = "Hello";
		String string2 = "worldiest";
		
		string1 = string1+string2;
		System.out.println(string1);
		
		string2= string1.substring(0,string1.length()-string2.length());
		System.out.println(string2);
		//string1= string1.substring()
		string1 = string1.substring(string2.length());
				
		
		System.out.println(string1);
		
		
		//int value=45;
		String nam = Integer.toString(10);
		int sToI= Integer.parseInt(nam);
		System.out.println(sToI);
		
		
		
		
		//super
		//overloading , overriding , this, static, 
		//OOPS concept : object , classes, Inheritance, Abstraction, Encapsulation, Polymorphism
		//wrapping classes
		//Types of variables : local , Instance variable , Static variables
		//data types in java : Primitive and Non Primitive data types 
						//	: Primitive :- int, double, char, float, boolean, long,byte, short\
						//  : Non Primitive : Array, String , interfaces, Arrays
		//Access Modifiers:- //Private   : 
							//default
							//protected 
							//public
	
	
	}

}
