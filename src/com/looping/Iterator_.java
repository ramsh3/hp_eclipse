package com.looping;

import java.util.*;

public class Iterator_ {
public static void main(String[] args) {
	ArrayList<String> sc= new ArrayList<String>();
	sc.add("reliance");
	sc.add("tcs");
	sc.add("wipro");
	sc.add("apple");
	Iterator i = sc.iterator();
	while (i.hasNext()) {
		System.out.println(i.next());
	}
}
}
