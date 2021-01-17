package com.javapractise;

public class RotationofArray {

	public static void main(String str[]) {
		int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		singleNumber(nums, k);
		// System.out.println();
	}

	public static void singleNumber(int[] nums, int k) {
		int i;

		for (i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

		for (i = 0; i < k; i++) {
			int last, j;
			last = nums[nums.length - 1];
			for (j = nums.length - 1; j > 0; j--) {
				nums[j] = nums[j - 1];

			}
			nums[i] = last;

		}
		System.out.println();

		for (i = 0; i < nums.length; i++) {

			System.out.print(nums[i] + " ");
		}

	}
}