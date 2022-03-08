package com.constructor_demo;

class stock{
	int open;
	int close;
	
	stock(int o, int c){ //construtor(classname and method same will be same)
		open=o;
		close=c;
		int a=o+c;
        System.out.println("addition of open and close = "+a);
	}
		 
}


public class Con_Demo {
	public static void main(String[] args) {
		stock so = new stock(100, 150);
	}		
}


