package com.programs;

import java.util.Scanner;

public class Multiplication_Table {
	static Scanner s = new Scanner(System.in);

	public static void table() {
		System.out.print("Enter the table number : ");
		int n=s.nextInt();
		System.out.println("Enter the value upto : ");
		int l = s.nextInt();
		for (int i = 1; i <=l; i++) {
			int ans=n*i;
			System.out.println(n+"*"+i+"="+ans);
		}
	}
	public static void main(String[] args) {
		table();
	}

}
