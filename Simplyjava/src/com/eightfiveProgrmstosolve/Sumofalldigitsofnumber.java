
package com.eightfiveProgrmstosolve;

public class Sumofalldigitsofnumber {

public static void main(String str[]) {
	int number = 1598763;
		int sum =0;
	int newnumber = number;
	while(newnumber!=0) {
		int i = newnumber%10;
		sum = sum+i;
	
		newnumber = newnumber/10;
		
		
	}
	System.out.print(sum);

	}

}
