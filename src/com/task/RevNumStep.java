package com.task;

public class RevNumStep {
	static int count;
	public static void countNumber(){
		int a=9;
		while(a>0){
		count++;
		a=a/10;
		}
		System.out.println(count);
		}
	public static void sumNumber(){
		int b=55564415;
		int sum=0;
		int c=0;
		while(b>0){
		c=b%10;
		sum=sum+c;
		b=b/10;
		}
		System.out.println(sum);
		}
	
public static void main(String[] args) {
		/*
		 * for (int i = 10; i > 0; i--) { System.out.print(i+" "); if (i==7||i==4||i==2)
		 * { System.out.println(); continue; } }
		 */
	sumNumber();
}
}
