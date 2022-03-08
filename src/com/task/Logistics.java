package com.task;

import java.util.Scanner;

public class Logistics {
	static {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your priorit number, press 1 as urgent otherwise press 0");
		int prior = s.nextInt();
		System.out.println("Enter weight of the post");
		int weight = s.nextInt();
		System.out.println("Enter your destination km ");
		int km = s.nextInt();
		if (prior == 0) {
			if (weight > 5) {
				if (km <= 250) {
					System.out.println("Your courier is dispatched by lorry");
				}
			}
			if (weight <= 5) {
				System.out.println("Your courier is dispatched by post");
			} else {
				System.out.println("Your courier is dispatched by train");

			}
		} 
		if (prior == 1) {
			if (weight < 100) {
				if (km < 50) {
					System.out.println("Your courier is dispatched by van");
				}
			} else {
				System.out.println("Your courier is dispatched by train");
			}
		}
	}
	public static void main(String[] args) {
	}
}
