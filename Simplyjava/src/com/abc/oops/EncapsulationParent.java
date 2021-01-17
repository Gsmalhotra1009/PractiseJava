package com.abc.oops;

public class EncapsulationParent {

	EncapsulationChild ec = new EncapsulationChild();

	public void getagechild() {
		ec.setAge(25);
		int childage = ec.getAge();

		System.out.println(childage);
	}

	public static void main(String str[]) {
		EncapsulationParent pa = new EncapsulationParent();
		pa.getagechild();
	}
}
