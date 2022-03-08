package com.task;

import java.util.Scanner;

public class Loan_Eligilibity {
	static {
		Scanner s = new Scanner(System.in);
		System.out.println("Are u married or unmarried job holder ?");
		String mtjh = s.nextLine();
		System.out.println("Are u working permanent or temporary job holder ?");
		String umtjh = s.nextLine();
		System.out.println("Enter your age ?");
		int age = s.nextInt();
		int service = 60 - age;
		if (mtjh.equalsIgnoreCase("unmarried") && umtjh.equalsIgnoreCase("permanent")) {
			if (service >= 30) {
				System.out.println("Your loan amount is Rs-50,000");
			} else {
				System.out.println("Your loan amount is Rs-25,000");
			}
		} else if (mtjh.equalsIgnoreCase("married") && umtjh.equalsIgnoreCase("permanent")) {
			if (service >= 30) {
				System.out.println("Your loan amount is Rs-60,000");
			} else {
				System.out.println("Your loan amount is Rs-35,000");
			}
		} else if (umtjh.equalsIgnoreCase("temporary")) {
			System.out.println("Your loan amount is Rs-10,000");
		} else {
			System.out.println("Input Mismatch.... Enter the correct input..");
		}
	}

	public static void main(String[] args) {
	}
}