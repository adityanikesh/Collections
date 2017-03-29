package com.aditya.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.aditya.controllers.Employee;

public class HashMapDemo {	

	public static void main (String[] args){
		//		Employee emp1 = new Employee("Java", "Spring");
		//		Employee emp2 = new Employee("Java", "Spring");
		//		System.out.println(emp1.hashCode());
		//		System.out.println(emp2.hashCode());
		//		System.out.println(emp1.equals(emp2));
		//		System.out.println(emp1==emp2);
		//		String s1 = "Hello";
		//		String s2 = "Hello";
		//		System.out.println(s1.hashCode());
		//		System.out.println(s2.hashCode());
		//		System.out.println(s1==s2);
		//		System.out.println(s1.equals(s2));
		//		String s3 = new String("Hello");
		//		System.out.println(s3.hashCode());
		//		String s4 = "Hi";
		//		System.out.println(s4.hashCode());

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("Naveen", 2);
        hm.put("Santosh", 3);
        hm.put("Ravi", 4);
        hm.put("Pramod", 1);
        hm.put("Aditya", 1);
//
//        for(Map.Entry<String, Integer> entry : hm.entrySet()){
//        	System.out.print(entry.getKey());
//        	System.out.print(entry.getValue());
//        }
//        
//        Set<Entry<String, Integer>> set = hm.entrySet();
//        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(
//                set);
//        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
//            public int compare(Map.Entry<String, Integer> o1,
//                    Map.Entry<String, Integer> o2) {
//                return (o2.getValue().compareTo(o1.getValue()))*-1;
//            }
//        });
//
//        for (Entry<String, Integer> entry : list) {
//            System.out.println(entry.getValue());
//
//        }
//        
        
        for(Map.Entry<String, Integer> map:hm.entrySet()){
        	map.getKey();
        }
        
        Set set1 = new HashSet();
        set1.add(1);
        set1.add(3);
        set1.add(12);
        
        Iterator itr = set1.iterator();
        while (itr.hasNext()){
        	System.out.println(itr.next());
        }
	}
}
