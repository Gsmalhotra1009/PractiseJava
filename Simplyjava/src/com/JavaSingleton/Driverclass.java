package com.JavaSingleton;

public class Driverclass {

	public static void main(String str[])
	{
		Singletonclass x= Singletonclass.getInstance();
		Singletonclass y =Singletonclass.getInstance();
		Singletonclass z =Singletonclass.getInstance();
		
	}
	
	
	/*Explanation: In the Singleton class, when we first time call getInstance() method, it creates an object 
	of the class with name single_instance and return it to the variable. Since single_instance is static, it is changed from 
	null to some object. Next time, if we try to call getInstance() method, since single_instance is not null, it is returned to the variable,
	instead of instantiating the Singleton class again. This part is done by if condition.
	In the main class, we instantiate the singleton class with 3 objects x, y, z by calling static method getInstance(). 
	But actually after creation of object x, variables y and z are pointed to object x as shown in the diagram. Hence, if we change the variables
	of object x, that is reflected when we access the variables of objects y and z. Also if we change the variables of object z, 
	that is reflected when we access the variables of objects x and y.

	*
	*https://www.geeksforgeeks.org/singleton-class-java/
	*/
	
	
	
	}


