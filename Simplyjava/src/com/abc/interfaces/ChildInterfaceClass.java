package com.abc.interfaces;


public class ChildInterfaceClass implements ParentInterface {

	@Override
	public void getcolor() {
		ParentInterface.getage();
		
	}

	public static void main(String str[]) {
		ChildInterfaceClass cic = new ChildInterfaceClass();
		ParentInterface.getage();
		ParentInterface.getclass();
		
		
		
	}
	
	
	

}
