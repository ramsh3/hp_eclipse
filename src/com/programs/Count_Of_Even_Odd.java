package com.programs;

import java.util.Scanner;

public class Count_Of_Even_Odd {

	static Scanner s = new Scanner(System.in);
	static int count;

	public static void count_Odd() {
		count = 0;
		System.out.print("Enter the number : ");
		int get = s.nextInt();
		for (int i = 0; i < get; i++) {
			if (i % 2 == 1) {
				count = count + 1;
				System.out.println(i);
			}

		}
		System.out.println("Total odd number in given number : " + count);
	}

	public static void count_Even() {
		count = 0;
		System.out.print("Enter the number : ");
		int get = s.nextInt();
		for (int i = 0; i < get; i++) {
			if (i % 2 == 0) {
				count = count + 1;
				System.out.println(i);
			}

		}
		System.out.println("Total even number in given number : " + count);
	}

	public static void main(String[] args) {
		//count_Odd();
		//count_Even();

		int d = 12;
		int n=0;
		int m=1;
		int total = 0;
		for(int i=1;i<=d;i++){
		total=n+m;
		System.out.println(total);
		n=m;
		m=total;

		}
	}
}
