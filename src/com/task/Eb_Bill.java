package com.task;

import java.util.Scanner;

public class Eb_Bill {
	static {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the electricity consumption unit : ");
		int unit = s.nextInt();
		if (unit > 1000) {
			System.out.println("Your charge Rs-10/unit ");
			System.out.println("EB bill was Rs-" + unit * 10);
		} else if (unit > 500 && unit <= 1000) {
			System.out.println("Your charge Rs-5/unit ");
			System.out.println("EB bill was Rs-" + unit * 5);
		} else if (unit > 200 && unit <= 500) {
			System.out.println("Your charge Rs-2/unit ");
			System.out.println("EB bill was Rs-" + unit * 2);
		} else {
			System.out.println("Your charge Rs-1/unit ");
			System.out.println("EB bill was Rs-" + unit);
		}
	}
	public static void main(String[] args) {
	}
}
