package com.pyramids;

public class Pyramidpatterns {

	public static void main(String str[]) {
/*
 1
12
123
1234
12345
123456
12345
1234
123
12
1
 */
		
	
	
		int count = 6;
		for (int i = 1; i <= count; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();

		}

		for (int k = count - 1; k >= 0; k--) {
			for (int l = 1; l <= k; l++) {

				System.out.print(l);
			}
			System.out.println();
		}

	}
}
