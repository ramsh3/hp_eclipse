package com.override_and_overloading;

public class Over_Ride extends OverLoading{
	@Override
	void maruti_Suzuki() {
		super.maruti_Suzuki();
		System.out.println();
		System.out.println("Updated Price List 2021");
		System.out.println("basic end variant ex-showroom price is 16L");
		System.out.println("mid end variant ex-showroom price is 19L");
		System.out.println("high end variant ex-showroom price is 23L ");
		System.out.println("********************************************");
	}
	
	@Override
	void maruti_Suzuki(String a) {
		super.maruti_Suzuki(a);
		System.out.println();
		System.out.println("Updated Price List 2021");
		System.out.println("basic end variant ex-showroom price is 9L");
		System.out.println("mid end variant ex-showroom price is 11.5L");
		System.out.println("high end variant ex-showroom price is 13L ");
		System.out.println("********************************************");
	}
	
	@Override
	void maruti_Suzuki(int a) {
		super.maruti_Suzuki(a);
		System.out.println();
		System.out.println("Updated Price List 2021");
		System.out.println("basic end variant ex-showroom price is 8.25L");
		System.out.println("mid end variant ex-showroom price is 9.55L");
		System.out.println("high end variant ex-showroom price is 11L ");
		System.out.println("********************************************");
	}
	
	public static void main(String[] args) {
      Over_Ride or = new Over_Ride();
      or.maruti_Suzuki();
      or.maruti_Suzuki("abc");
      or.maruti_Suzuki(130000);
      
	}

}
