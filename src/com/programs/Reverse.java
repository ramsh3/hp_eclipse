package com.programs;

import java.util.Scanner;

public class Reverse {

	static Scanner rn = new Scanner(System.in);
	static int a, i, j;

	public static void reverse_Number() {
		System.out.print("Enter a number : ");
		int n = rn.nextInt();
		// a = n;
		while (n > 0) {
			i = n % 10;
			//j = (j * 10) + i;
			System.out.print(i);
			n = n / 10;
		}
		//System.out.println("Reverse number is " + j);
	}

	public static void main(String[] args) {
		//reverse_Number();
		int a=548878;
		int i=0;
		while(a>0){
		i=a%10;
		System.out.print(i);
		a=a/10;
	}
}
}