package com.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Find_Occerance {
	// static Scanner s = new Scanner(System.in);

	void count() {
		String cha = "Fuzzy Wuzzy was a bear Fuzzy Wuzzy had no hair Fuzzy Wuzzy wasn’t very fuzzy was he";
		String[] sp = cha.split(" ");
		// System.out.println(sp.length);
		for (String sr : sp) {
			// System.out.println(sr);
		}
		Map<String, Integer> save = new HashMap<String, Integer>();

		for (String s : sp) {
			if (save.containsKey(s)) {
				Integer i = save.get(s);
				save.put(s, i + 1);

			} else {
				save.put(s, 1);
			}
		}
		System.out.println(save);

		Set<Entry<String, Integer>> es = save.entrySet();
		for (Entry<String, Integer> en : es) {
			if (en.getValue() > 2) {
				System.out.println(en);
			}
		}
	}

	public static void main(String[] args) {
		String name = "asdcswfsgfvafewsgsdfhafsdhg";
		String[] word = name.split("");
		Map<String, Integer> countWord = new HashMap();
		for (String e : word) {
			if (countWord.containsKey(e)) {
				Integer num =countWord.get(e);
				countWord.put(e, num + 1);
			} else {
				countWord.put(e, 1);
			}
			
		}
		Set<Entry<String, Integer>> each = countWord.entrySet();
		for (Entry<String, Integer> i : each) {
			System.out.println(i.getKey() + "      " + i.getValue());

		}
	}
}
