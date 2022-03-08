package com.programs;

import java.util.Scanner;

public class Factorial_Number {

	static Scanner s = new Scanner(System.in);

	public static void factorial() {
		int total=1;
		System.out.print("Enter the number : ");
		int a = s.nextInt();
		for (int i = 1; i < a; i++) {
			total=total*i;
		}
	System.out.println("The Given Factorial Number is "+total);
	}
	public static void main(String[] args) {
		factorial();
	}
}
