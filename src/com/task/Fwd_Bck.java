package com.task;

import java.util.Scanner;

public class Fwd_Bck {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = s.nextInt();
		int b = a-1;
		int c=b+1;
		int d = c+1;
		System.out.println(b+" "+c+" "+d);

	}

}
