package com.interface_keyword;

interface Price_List_2020 {
	void price_2020();
}

interface Price_List_2021 extends Price_List_2020 {
	void price_2021();
}

class Interface_Extends implements Price_List_2021 {
	
	 public void price_2020() {
		System.out.println("swift price is 6L");
	}
	
	public void price_2021() {
		System.out.println("updated swift price is 6.5L");
	}
	
	public static void main(String[] args) {
		Interface_Extends p = new Interface_Extends();
		p.price_2020();
		p.price_2021();
	}

}
