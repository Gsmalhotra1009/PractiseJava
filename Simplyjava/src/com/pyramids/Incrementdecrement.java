package com.pyramids;

public class Incrementdecrement {

	public static void main(String str[]) {

		/* FOllowing format printer 
		 * 1
		 * 121 
		 * 12321 
		 * 1234321 
		 * 123454321 
		 * 12345654321
		 * 
		 * 
		 */

		int j = 0;
		int i = 0;
		for (i = 0; i <= 6; i++) {

			for (j = 1; j <= i; j++) {

				System.out.print(j);

			}

			for (int k = j; k > 0; k--) {
				System.out.print(k);

			}
			System.out.println();
		}
	
	
	
	
	
	
	}

}

// }
