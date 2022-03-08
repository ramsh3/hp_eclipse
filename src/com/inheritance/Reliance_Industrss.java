package com.inheritance;

public class Reliance_Industrss extends Reliance_Industry {
	
	public static void rec() {
		System.out.println("reliance now 2022");
	}
	
	
	public static void main(String[] args) {
		// Reliance_Industrss r = new Reliance_Industrss();
		// r.ril_2020();
		// r.ril_2021();
		Reliance_Industry ri = new Reliance_Industrss();	
			ri.ril_2020();
			ri.ril_2021();
		
	}

}
