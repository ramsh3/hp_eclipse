package com.programs;

public class Rev_String {
	
	public static void reverse() {
        String chara = "kishore";
        String[] sep = chara.split("");
        for (int i = sep.length-1; i >=0 ; i--) {
			System.out.println(sep[i]);
		}
	}
	public static void main(String[] args) {
		reverse();
	}

}
