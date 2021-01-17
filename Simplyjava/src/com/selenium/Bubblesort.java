package com.selenium;

public class Bubblesort {
	public static void bubblesort(int arr[])

	{
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
	}

	// print the array
	static void printarray(int arr[])

	{
		for (int i = 0; i <= arr.length; i++) {
			System.out.println("Values to be sorted" + arr[i]);
		}
	}

	public static void main(String str[]) {

		int ascending[] = { 1, 5, 6, 7, 8 };
		bubblesort(ascending);
		printarray(ascending);

	}
}