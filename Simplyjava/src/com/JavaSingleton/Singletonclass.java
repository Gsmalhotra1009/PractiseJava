package com.JavaSingleton;

public class Singletonclass {
//Normal class vs Singleton class: Difference in normal and singleton class in terms of instantiation is that, 
	//For normal class we use constructor, whereas for singleton class we use getInstance() method (Example code:I). In general, 
//	to avoid confusion we may also use the class name as method name while defining this method (Example code:II).
	
	private static Singletonclass singletonclass = null;
	public String s;
	private Singletonclass() {
	
		s= "Hello World";
		
	}
	
	public static Singletonclass getInstance()
	{
		if(singletonclass == null)
		{
			singletonclass = new Singletonclass();
		}
		return singletonclass;
		
	}
	
	

}

