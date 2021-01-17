package com.Java.AbstractInterface;

abstract class AbstractDemo {

	public int i;
	final int rollno=45;
	private String name = "Gundeep";
	char ch = 'G';
	protected String lstname ;
	
	

	//Does not have body
	public abstract void demo();
	
	
	//static method
	public static void getname() {
	  	System.out.println("My name is ");
	}
	
	//private normal method
	private void getsex() {
		
	}
	
	//Abstract methods are allowed for public and protected
	
	
	 protected abstract void getsection();
	
	
	 
		 
	 
	
	
	//final method
	public final void getcolor() {
	getsex();	
	}
		
	
	//Normal Method
	public void getage() {
		getcolor();
	}
	
	//Default methods are not allowed
	 void getid() {
		
	}
	
	
	
	


}
