package com.programs;

import java.util.Scanner;

public class Duplicate_Element {
	static Scanner s = new Scanner(System.in);

	public static void find_Duplicate_Number() {

		int num[]=new int [] {4,7,5,8,5,4,7};
		System.out.println("Duplicate elements in array");
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if (num[i]==num[j]) {
					System.out.println(num[i]);
				}
			}
			
		}
		}
	public static void find_Duplicate_String() {
		String str[]=new String [] {"r","e","r","e","w","a","h","f","h"};
		System.out.println("Duplicate elements in array");
		for (int i = 0; i < str.length; i++) {
			for (int j = i+1; j < str.length; j++) {
				if (str[i]==str[j]) {
					System.out.println(str[i]);
				}
			}
			
		}
		}
	public static void main(String[] args) {
		find_Duplicate_Number();
		find_Duplicate_String();
	}
	}

