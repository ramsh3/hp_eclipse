package com.programs;

public class High_And_Low {
	static int a[] = new int[] { 100, 14, 50, 123, 211, 66, 75, 333 };
	static String str[] = { "ramesh" };

	public static void high_Number() {

		int max = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("Enter the highest number in array : " + max);
	}

	public static void low_Number() {
		int min = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Enter the lowest number in array : " + min);
	}

	public static void reverse_Element() {
		for (int i = a.length; a.length > 0; i--) {
			System.out.println(a[i-1]);
		}
	}

	public static void main(String[] args) {
		high_Number();
		low_Number();
		reverse_Element();
		
		
	}
}
