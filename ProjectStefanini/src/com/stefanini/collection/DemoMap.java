package com.stefanini.collection;

import java.util.LinkedHashMap;
import java.util.Set;

public class DemoMap {

	public static void main(String[] args) {
		
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		
		map.put("101", "Pune");
		map.put("102", "Amravati");
		map.put("103", "Badnera");
	
		Set<String> set = map.keySet();
	
		for (String str :set) {
			System.out.println(str);
			System.out.println(map.get(str));
		}
		
		
	}

}
