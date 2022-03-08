package com.casting;

public class UpcastingTest2 extends UpcastingTest1{

	/*public void methodOne() {
		System.out.println("method2");
	}*/
	
	public static void main(String [] args) {
		UpcastingTest1 t = new UpcastingTest2();
		t.methodOne();
	}
}
