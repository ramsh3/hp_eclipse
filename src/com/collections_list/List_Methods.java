package com.collections_list;

import java.util.*;

public class List_Methods {
	static ArrayList<String> sc_name = new ArrayList<String>();
	static ArrayList <String> sc_name2 = new ArrayList <String>();

	public static void types() {
		sc_name.add("reliance");
		sc_name.add("tcs");
		sc_name.add("wipro");
		sc_name.add("apple");
		sc_name.add("microsoft");
		System.out.println(sc_name);
		sc_name.get(3);
		sc_name.set(0, "accenture");
		System.out.println(sc_name);
		System.out.println(sc_name.size());
		int indexOf = sc_name.indexOf("tcs");
		System.out.println(indexOf);
		boolean contains = sc_name.contains("apple");
		System.out.println(contains);
	}
	public static void types2() {
		sc_name2.add("apple");
		sc_name2.add("netflix");
		sc_name2.add("disney");
		sc_name2.add("tcs");
		//sc_name2.retainAll(sc_name);
		//System.out.println(sc_name2);
		sc_name.addAll(sc_name2);
		System.out.println(sc_name);
		Collections.sort(sc_name);
		System.out.println(sc_name);
		
	}
	public static void main(String[] args) {
		types();
		types2();
	}
}
