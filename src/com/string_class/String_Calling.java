package com.string_class;

public class String_Calling {
	
	public static void main(String[] args) {
		
		String s = "ramesh ";
		String s1 = "ramesh kumar";
		
		s= s.concat("kumar");
		
		String ss = new String("ramesh");
		
		String ss1 = new String("ramesh kumar");		
		
		System.out.println(s);

		System.out.println(ss);
		
		System.out.println(s.equals(ss));
		
		System.out.println(s.equals(ss1));
		
		System.out.println(s==ss);
		
		System.out.println(s==ss1);
		
		//System.out.println(s==s1);
		
		System.out.println(25+25+"ramesh"+25+25);
	}
}
 