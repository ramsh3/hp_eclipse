package com.override_and_overloading;

public class OverLoading {
	void maruti_Suzuki() {
		System.out.println("Brezza");
		System.out.println("basic end variant ex-showroom price is 14L");
		System.out.println("mid end variant ex-showroom price is 17L");
		System.out.println("high end variant ex-showroom price is 21L ");
	}
	
	void maruti_Suzuki(String a) {
		System.out.println("Baleno");
		System.out.println("basic end variant ex-showroom price is 7L");
		System.out.println("mid end variant ex-showroom price is 9.5L");
		System.out.println("high end variant ex-showroom price is 11L ");
	}
	
    void maruti_Suzuki(int a) {
    	System.out.println("Swift");
    	System.out.println("basic end variant ex-showroom price is 6.25L");
    	System.out.println("mid end variant ex-showroom price is 7.5L");
    	System.out.println("high end variant ex-showroom price is 9L ");
    }
	
}


