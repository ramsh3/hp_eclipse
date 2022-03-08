package com.task;

import java.util.Scanner;

public class Onsite_Condition {
	
	static Scanner s = new Scanner(System.in);

	public static void conditions() {
		System.out.println("Does he has passport?");
		if ("yes".equals(s.nextLine())) {
			// communication skill test
			System.out.println("Enter the IELTS mark");
			if (s.nextInt() > 7) {
				//internal feedback test
				System.out.println("Enter the 1st internal assessment test marks (Out of 100 marks)");
				int one = s.nextInt();
				System.out.println("Enter the 2nd internal assessment test marks (Out of 100 marks)");
				int two = s.nextInt();
				System.out.println("Enter the 3rd internal assessment test marks (Out of 100 marks)");
				int three = s.nextInt();
				if (one + two + three > 75) {
					System.out.println("Enter the years of experience");
					if (s.nextInt() >= 2) {
						System.out.println("Enter the age");
						if (s.nextInt() >= 23) {
							System.out.println("Employee is eligible to go to on-site");
						}
					}
				}
			}
		} else {
			System.out.println("Employee is not eligible to go to on-site");
		}
	}

	public static void main(String[] args) {
		conditions();
	}

}
