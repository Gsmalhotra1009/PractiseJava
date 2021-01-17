package com.JavaSingleton;

public class JavaCosntructors {
	
	
	
	
	
	
	

	int a =45;
	int b=65;
	public JavaCosntructors() {
		this.a= a;
		this.b = b;
		System.out.println(a +" "+ b);
	}
	
	public static void main(String str[]) {
		//JavaCosntructors cons= new JavaCosntructors();
		JavaCosntructors cons1= new JavaCosntructors();
		//System.out.println(cons1.toString());
		
		String value = "99";
		int val = Integer.parseInt(value);
		System.out.println(val);
		
		Integer inti = new Integer(val);
		System.out.println(inti);
		
		
		
		String newval = String.valueOf(val);
		System.out.println(newval);
		
		String name = "Gundeep";
		StringBuilder builder = new StringBuilder(name);
		System.out.println(builder.reverse());
		
	}

}
