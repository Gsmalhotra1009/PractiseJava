package com.eightfiveProgrmstosolve;

public class PairOfElementWhoseSumIsequalsToSomeValue {

	public static void main(String str[]) {
		int array[] = {4,5,7,11,9,13,8,25};
		for(int i=0;i<array.length;i++) {
			for(int j=1;j<array.length;j++) {
				int sum = array[i]+array[j];
				if(sum == 20) {
					System.out.println(array[i]+","+array[j]);
				}
			}
		}
	
	}

}
