package com.eightfiveProgrmstosolve;

public class numberLessthanCurrentExcludingGivenDigit {

	public static void main(String str[]) {
		int number = 878;
		int digit = 7;
		int i = number;
		int count = 0;
		int value = 0;
		int initial = 1;
		while (i != 0) {
			int new_number = i % 10;
			count++;
			if (new_number == digit) {
				System.out.println(count);
				count = count - 1;
				for (int j = 1; j <= count; j++) {
					initial = initial * 10;
					if (j == count) {
						int exactvalue = number % initial;
						int result = number - exactvalue - 1;
						System.out.println(result);
						break;
					}

				}
			}
			i = i / 10;

		}

		System.out.print(count);

	}

}
