package com.Java.AbstractInterface;

public class ChildAbstractDemo extends AbstractDemo{

	@Override
	public void demo() {
		System.out.println("Demo class looks nice");
		
		
	}

	
	public static void main(String str[]) {
		ChildAbstractDemo cad = new ChildAbstractDemo();
		cad.demo();
		AbstractDemo.getname();
		cad.getage();
		cad.getcolor();
		
		
	}


	@Override
	protected void getsection() {
		// TODO Auto-generated method stub
		
	}
	

}
