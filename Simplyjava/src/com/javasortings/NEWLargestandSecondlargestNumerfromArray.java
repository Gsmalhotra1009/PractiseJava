package com.javasortings;

import java.util.Arrays;

public class NEWLargestandSecondlargestNumerfromArray {

	public static void main(String str[]) {
		int sequesnceList[] = { 89, 45, 95, 88, 15 };
		int smallest = sequesnceList[0];
		int largest = sequesnceList[0];

		for (int i = 0; i < sequesnceList.length; i++) {
			if (sequesnceList[i] < smallest) {
				smallest = sequesnceList[i];
			} else if (sequesnceList[i] > largest) {
				largest = sequesnceList[i];
			}
		}

		System.out.println(Arrays.toString(sequesnceList));
		System.out.println(smallest);
		System.out.println(largest);

		// CHeck the second largest

		int list[] = { 15, 48, 85, 75, 95, 3, 7 };
		int lar = list[0];
		int seconlar = list[0];

		for (int j = 0; j < list.length; j++) {
			if (list[j] > lar) {
				seconlar = lar;
				lar = list[j];
			} else if (list[j] > seconlar) {
				seconlar = list[j];

			}
		}

		System.out.println(Arrays.toString(list));
		System.out.println(lar);
		System.out.println(seconlar);
	}
}
