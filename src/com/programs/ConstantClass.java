package com.programs;

public class ConstantClass {
	static void reverses(String str) {
		System.out.println(str);
		char[] inputArray = str.toCharArray();
		char[] result = new char[inputArray.length];
		System.out.println(inputArray.length);
		System.out.println(result.length);
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] == ' ') {
				result[i] = ' ';
			}
		}
		int j = result.length - 1;
		for (int i = 0; i < inputArray.length; i++) {

			if (inputArray[i] != ' ') {

				if (result[j] == ' ') {
					j--;
				}

				result[j] = inputArray[i];
				j--;
			}
		}
		System.out.println(String.valueOf(result));
	}

	public static void main(String[] args) {
		// reverses("today is a java class at 5 pm");
		myTry();
	}

	// my try
	public static void myTry() {

		String myName = "My name is ramesh";
		char[] n = myName.toCharArray();
		char[] empty = new char[n.length];

		for (int i = 0; i < n.length; i++) {
			if (n[i] == ' ') {
				empty[i] = ' ';
			}
		}
		System.out.println(empty);
		int j = empty.length - 1;
		for (int i = 0; i < n.length - 1; i++) {
			if (n[i] != ' ') {
				if (empty[j] == ' ') {
					j--;
				}
				empty[j] = n[i];
				j--;
			}
		}
		System.out.println(myName);
		System.out.println(empty);
	}
}
