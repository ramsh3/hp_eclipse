package com.interface_keyword;

interface Stock_Info {
	
	void stock_Demo();
	
}

interface Vol_Oi {
	
	void stock_Vol_Oi();
	
}

public class Multi_Inheitance implements Stock_Info,Vol_Oi {
	@Override
	public void stock_Demo() {
		System.out.println("Tata Consulting Service");
		System.out.println();
		System.out.println("open price = 2200");
		System.out.println("high price = 2225");
		System.out.println("low price = 2197");
		System.out.println("close price = 2219");
		
	}
	@Override
	public void stock_Vol_Oi() {
		System.out.println("Total volume traded = 3213131");
		System.out.println("Total open interest = 21323");
	}
	
	public static void main(String[] args) {
		Multi_Inheitance tcs = new Multi_Inheitance();
		tcs.stock_Demo();
		tcs.stock_Vol_Oi();
		
	}
	
}

