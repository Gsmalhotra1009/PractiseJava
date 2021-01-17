package com.abc.oops;

public class ChildClassFinalisAllowedorNOt extends ParentClass {

	@Override
	public void getsalary() {

		System.out.println("Working on child class");
	}


public static void main(String str[]) {
	ParentClass p = new ChildClassFinalisAllowedorNOt();
	p.getage();
	p.getsalary();
	
}


}