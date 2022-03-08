package com.programs;

public class ArmStrongNumber {

	public static void main(String[] args) {
		for(int j=1;j<=1000;j++) {
		int num = j;
		int temp = num;
		int i =0;
		int total=0;
		while(temp>0){
		i=temp%10;
		total=total+i*i*i;
		temp=temp/10;
		}
		if(num==total){
		System.out.println("this is armstrong number"+total);
		} /*else {
		System.out.println("this is not armstrong number");
		}*/
		
		}
		
		
	}

}
