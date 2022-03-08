package com.interface_keyword;

public interface Apple_Products {
	
	void iPhones();
	
	void macintosh();
	
	void iWatch();

}

class Product_Info implements Apple_Products {
	
	@Override
	public void iPhones() {
		System.out.println("Apple launched new model phones in 2020");
		System.out.println("Iphone 12 mini");
		System.out.println("Iphone 12");
		System.out.println("Iphone 12 pro");
		System.out.println("Iphone 12 pro max");
		System.out.println("***************************");
		System.out.println();
	}
	
	@Override
	public void macintosh() {
		System.out.println("Apple introduced new M1 chipset");
		System.out.println("Macbook Air 12inch");
		System.out.println("Macbook pro 12inch");
		System.out.println("Macbook pro 14.5inch ");	
		System.out.println("***************************");
		System.out.println();
	}
	
	@Override
	public void iWatch() {
		System.out.println("Apple introduced new watch series");
		System.out.println("Apple watch 6 series");
		System.out.println("Apple watch SE series");
		System.out.println("***************************");
		System.out.println();
	}
	
	public static void main(String[] args) {
		Product_Info i = new Product_Info();
		i.iPhones();
		i.macintosh();
		i.iWatch();
		
	}
	
	

}



