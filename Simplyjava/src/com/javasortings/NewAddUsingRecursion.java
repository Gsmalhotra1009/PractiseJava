package com.javasortings;

public class NewAddUsingRecursion {

	public static void main(String str[]) {
		int i = 10 ;
		System.out.println(getsum(i));
		
		//adding number 15 to 20
		int n =10;
		int k =20; 
		System.out.println(gethaltingsum(n, k));
		
	}
	
	
	public static int getsum(int i) {
		if(i<=0) {
			return 0;
		}else {
			
			return i + getsum(i-1);
		}
	}
	
	
	//Halting conditions
	
	public static int gethaltingsum(int start,int end) {
		if(end>start) {
			return end + gethaltingsum(start, end-1);
		}else {
			
			return end;
		}
	}

}
