package com.constructor_demo;
public class Chain_Constructor {
	
	int age;
	String name;
	String address;
	
	public Chain_Constructor() {
		this(5);
		System.out.println("this is a default parameter");
		
		

	}
	
	public Chain_Constructor(int a) {
		this("ramesh");
		System.out.println("value of int a:"+a);
		
	}
	
	public Chain_Constructor(String n) {
		this("rj","vishal");
		System.out.println("my name is:"+n);

	}

	public Chain_Constructor(String a,String b) {
		System.out.println("my friends are:"+a+","+b);
	}
	
	/*public Chain_Constructor(Chain_Constructor c) {
		//name=c.name;
		c.name=name;
		
	}*/
	
	public static void main(String[] args) {
		/*Chain_Constructor cc = new Chain_Constructor();
		Chain_Constructor cc1 = new Chain_Constructor(24);
		Chain_Constructor cc2 = new Chain_Constructor("ramesh");
		Chain_Constructor cc3 = new Chain_Constructor("r","s");
		//Chain_Constructor cc4 = new Chain_Constructor(cc2);*/
		
		//System.out.println(cc4.name);
		
		Chain_Constructor c1 = new Chain_Constructor();
		/*Chain_Constructor c2 = new Chain_Constructor();
		Chain_Constructor c3 = new Chain_Constructor();
		Chain_Constructor c4 = new Chain_Constructor();*/
		
		


		
		
		
	}
	
	
}
