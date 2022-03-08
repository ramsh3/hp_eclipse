package com.constructor_demo;

public class Constructor_One {
	int open;
	int close;
	int high;
	int low;
    String stocks;
	Constructor_One(int o,int c,int h,int l,String s) {
		open=o;	
		close=c;
		high=h;
		low=l;
		stocks=s;
		System.out.println("Today chart : "+s);
		System.out.println("Today opening price  : "+o);
		System.out.println("Today closing price  : "+c);
		System.out.println("Today highest price  : "+h);
		System.out.println("Today lowest price  : "+l);
	}
	
	public static void main(String[] args) {
		Constructor_One co = new Constructor_One(103, 110, 112, 101, "HDFC");
		/*System.out.println("Today chart : "+co.stocks);
		System.out.println("Today opening price  : "+co.open);
		System.out.println("Today closing price  : "+co.close);
		System.out.println("Today highest price  : "+co.high);
		System.out.println("Today lowest price  : "+co.low);
				*/
	}
}
