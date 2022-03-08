package com.abstraction;

public class Ipo_Info extends Ipo_Details {
	
	@Override
	void IRCTC() {
		System.out.println("Indian Railways");
		System.out.println("IPO price - 340");
		System.out.println("Listed Year - 2019 ");
		System.out.println();	
	}
	
	@Override
	void zomato() {
		System.out.println("Zomato");
		System.out.println("IPO price - 120");
		System.out.println("Listed Year - 2021 ");
		System.out.println();		
	}
	
	@Override
	void eris_Health_Science() {
		System.out.println("Eris Health Science");
		System.out.println("IPO price - 200");
		System.out.println("Listed Year - 2021 ");
		System.out.println();
	}
	
	@Override
	void zydus_Cadila() {
		System.out.println("Zydus Cadila");
		System.out.println("IPO price - 420");
		System.out.println("Listed Year - 2020");
		System.out.println();		
	}
	
	public static void main(String[] args) {
		Ipo_Info i = new Ipo_Info();
		i.IRCTC();
		i.zomato();
		i.eris_Health_Science();
		i.zydus_Cadila();
		
	}
}
