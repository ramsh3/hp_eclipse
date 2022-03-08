package com.programs;

import java.util.Scanner;

public class Odd_And_Even {
	
	static Scanner s = new Scanner(System.in);
	static int total;
	public static void odd() {
		System.out.println("Enter the number : ");
		int total=0;
		int in = s.nextInt();
		for (int i = 0; i < in; i++) {
			if (i%2==1) {
				System.out.println(i);
				total=total+i;
			}
		}
		System.out.println("Sum of odd numbers : "+total);
	}
	public static void even() {
		System.out.println("Enter the number : ");
		int in = s.nextInt();
		for (int i = 0; i < in; i++) {
			if (i%2==0) {
				System.out.println(i);
				total=total+i;
			}
		}
		System.out.println("Sum of odd numbers : "+total);
	}
	
	public static void main(String[] args) {
		//odd();
		even();
	}

}
