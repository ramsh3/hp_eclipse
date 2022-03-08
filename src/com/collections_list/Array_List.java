package com.collections_list;

import java.util.*;

public class Array_List {
	static ArrayList<Integer> num = new ArrayList<>();
	static ArrayList<String> str = new ArrayList<>();

	public static void type_One() {
		// ArrayList <Integer> num = new ArrayList <Integer>();
		num.add(21);
		num.add(1, 03);
		num.add(03);
		num.add(1997);
		num.add(1997);
		num.add(1997);
		Set<Integer> setList = new HashSet(num);
		/*System.out.println("For Loop");
		for (int i = 0; i < num.size(); i++) {
			System.out.println(num.get(i));
		}*/
		System.out.println();
		System.out.println("Foreach Loop");
		for (Integer i : setList) {
			System.out.println(i);
			System.out.println(i+"=" +Collections.frequency(num, i));
		}
	}

	public static void type_Two() {
		str.add("Reliance");
		str.add("TCS");
		str.add("Wipro");
		str.add(1, "Accenture");
		System.out.println();
		System.out.println("Using iterator class");
		Iterator itr = str.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		str.set(0, "MindTree");
		System.out.println();
		System.out.println(str);
		System.out.println();
		System.out.println(str.get(2));
		str.remove("tcs");
	}

	public static void sorting() {
		Collections.sort(num);
		System.out.println();
		System.out.println("Ascending Order");
		for (Integer i : num) {
			System.out.println(i);
		}
		Collections.sort(str);
		Iterator itr = str.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public static void main(String[] args) {
		type_One();
		/* type_Two();
		 sorting();*/
	}
}
