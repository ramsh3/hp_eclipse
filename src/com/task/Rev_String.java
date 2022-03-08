package com.task;

import java.util.ArrayList;
import java.util.List;

public class Rev_String {
	public static void main(String[] args) {
		String s = "My name is ramesh";
		String r = "";
		
		for (int i = s.length() - 1; i >= 0; i--) {
			r = r + s.charAt(i);
		}
		String ns = r.replaceAll(" ", "");
		List<Object> rs = new ArrayList<>();
		for (int i = 0; i < ns.length(); i++) {
			rs.add(ns.charAt(i));
		}
		rs.add(2," ");
		rs.add(7," ");
		rs.add(10," ");

		System.out.println(rs);
		String s3=String.valueOf(rs);
		s = r.replaceAll(",", "");
		System.out.println(s3);

	}
}
