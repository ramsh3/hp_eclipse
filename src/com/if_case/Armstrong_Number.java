package com.if_case;

import java.util.Scanner;

public class Armstrong_Number {

	static int ans, a, i,x;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the number : ");
		
		int num = s.nextInt();
		
		int temp=num;
	//	for (int i = 0; i < temp; i++) {
			while (i>0) {
				a=a%10;
				ans=ans+(a*a*a);
				i=i/10;
				
			}
			
		//}
	}
}
