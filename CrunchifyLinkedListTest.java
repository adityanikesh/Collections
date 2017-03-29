package com.aditya.collections;


public class CrunchifyLinkedListTest {

	public static void main(String[] args) {
		CrunchifyLinkedList list = new CrunchifyLinkedList();
		list.add("0");
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		System.out.println(list);
		list.remove(4);
		System.out.println(list);
	}
}
