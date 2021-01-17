package com.javapractise;


public class Stringfunctions {
	public double getavgno(int[] avg, int x, int z) {

		for (int i = 0; i < avg.length; i++) {
			x += avg[i];
		}
		System.out.println(x);
		z = avg.length;
		System.out.println(z);
		double r = x % z;
		return r;
	}




public static void main(String str[])
{
 Stringfunctions sf=new Stringfunctions();
 int avg[]= {5,7,8,10,11,12};
 int x=0;
 int z=0;
 
 //
 String ne="456";
 int i = Integer.parseInt(ne);
 
 
 //
 
 int klfdj = 45;
 String dn= String.valueOf(klfdj);
 
 

 System.out.println( sf.getavgno(avg, x, z));
 
	}
}
