package com.stefanini.collection;

import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(50);
		hs.add(70);
		hs.add(80);
		hs.add(90);

		for (Integer i : hs) {
			System.out.println(i);
		}

	}

}
