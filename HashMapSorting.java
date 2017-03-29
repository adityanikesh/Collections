package com.aditya.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapSorting {

	public static void main(String[] args){
		Map<String, Integer> unsortMap = new HashMap<String, Integer>();
		unsortMap.put("B", 55);
		unsortMap.put("A", 80);
		unsortMap.put("D", 20);
		unsortMap.put("C", 70);
		
		List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(unsortMap.entrySet());
		
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {

			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		Map<String, Integer> sortMap = new HashMap<String, Integer>();
		for(Entry<String, Integer> entry: list){
			sortMap.put(entry.getKey(), entry.getValue());
			System.out.println("Key: "+ entry.getKey()+"  "+"Value: "+entry.getValue());
		}
	}
}
