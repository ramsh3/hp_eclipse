package com.programs;

import java.util.Scanner;

public class Find_Even_Odd {
	static Scanner s = new Scanner(System.in);

	public static void find() {
		System.out.print("Enter the number : ");
		int i = s.nextInt();
		if (i % 2 == 0) {
			System.out.println("The Given number is Even ");
		} else {
			System.out.println("The Given number is odd ");
		}
	}

	public static void main(String[] args) {
		find();
	}
}
