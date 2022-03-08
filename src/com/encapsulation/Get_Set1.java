package com.encapsulation;

public class Get_Set1 extends Get_Set {
	
	public static void main(String[] args) {
		Get_Set1 gs = new Get_Set1();
		gs.setStocks("ITC");
		gs.setA("ola introduced electric bike");
		System.out.println(gs.getStocks());
		System.out.println(gs.getA());
	}

}
