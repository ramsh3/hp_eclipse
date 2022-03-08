package com.looping;

public class Fibannoci_Series {
	
	public static void main(String[] args) {
		
		int a=100;
		int b=1;
		
	for (int i = 1; i < 20; i++) {		
		int c=a+b;		
		System.out.println(c);		
		a=b;    //swapping
		b=c; 	
		
		}											
	}		
}				
