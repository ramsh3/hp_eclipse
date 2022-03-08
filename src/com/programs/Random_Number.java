package com.programs;

import java.util.Random;

public class Random_Number {
	static Random r = new Random();
	public static void default_Random_Number() {
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
	}

	public static void limit_Random_Number() {
		int min = 100;
		int max = 200;

		for (int i = 0; i < 10; i++) {      //one type
			int set_Limit = (int) (Math.random() * (max - min + 1) + min);
			System.out.println(set_Limit);

		}
		for (int i = 0; i <10; i++) {           //another type
			int set_Limit = (int) (Math.random() * (1000 - 100 + 1) + 100);
			System.out.println(set_Limit);
		}

	}
	
	

	public static void main(String[] args) {
		default_Random_Number();
		limit_Random_Number();
	}
}
