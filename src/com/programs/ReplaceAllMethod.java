package com.programs;

public class ReplaceAllMethod {

	public static void main(String[] args) {

		String name = "Richard12345";

		String name1 = name.replaceAll("[^a-zA-Z]", "");

		System.out.println(name1);

	}

}
