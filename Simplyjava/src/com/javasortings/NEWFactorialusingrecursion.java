package com.javasortings;

public class NEWFactorialusingrecursion {

public static void main(String str[]) {
	
	int  m = 5;
	System.out.println(findFactorial(m));
}

public static int findFactorial(int m) {
	if(m<=1) {
		return m;
	}else {
		return m * findFactorial(m-1);
	}
}

}
