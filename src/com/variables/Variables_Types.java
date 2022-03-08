package com.variables;

public class Variables_Types {
	int a;
	int b;
	String c;
	static int ab=10;
	static String ac ="apple";
	
	void add(int e,int f) {
		int add1 = e+f;
		System.out.println("addition of 2 number : "+add1);
		
	}
	void mul(int a,int b) {
		this.a=a;
		this.b=b;
		int mul1=a+b;
		System.out.println("multiply of 2 number : "+mul1);
	}
	void join(String ad) {
		System.out.println(ad);
	}
	void global() {
		System.out.println(ac);
	}
	void sub(int w) {
		int sub1=ab-w;
		System.out.println(sub1);
	}
	public static void main(String[] args) {
		Variables_Types v = new Variables_Types();
		v.add(10, 2000);
		v.mul(2324, 76586);
		v.join("iphone");
		v.global();
		v.sub(1);
		
	}
	
	

}
