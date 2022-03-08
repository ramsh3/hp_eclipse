package com.task;

import java.util.Scanner;

public class Employee_Taxation {
	static int emi;
	public static void tax_Slabs() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your monthly salary  : ");
		int salary = s.nextInt();
		System.out.println("Do you have any home and education loan emi?");
		String str = s.next();
		if (str.equalsIgnoreCase("yes")) {
			System.out.print("Enter your monthly emi amount : ");
			emi = s.nextInt();
		}
		int minus = (salary * 12) - (emi * 12);
		if (minus >= 1000000) {
			System.out.println("Your annual tax amount will be " + (minus * 0.3));
		} else if (minus <= 500000) {
			System.out.println("Your annual tax amount will be " + (minus * 0.05));
		} else {
			System.out.println("Your annual tax amount will be " + (minus * 0.2));
		}
	}
	public static void main(String[] args) {
		tax_Slabs();
	}
}
