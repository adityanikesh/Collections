package com.aditya.collections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static class Employee implements Comparable{

		int id;
		String name;

		public Employee(int id, String name){
			this.id = id;
			this.name = name;
		}
		public String toString(){
			return this.id+" "+this.name;
		}

		public int compareTo(Object o1) {
			Employee e1 = (Employee)this;
			Employee e2 = (Employee)o1;
			if(e1.id<e2.id){
				return -1;
			}
			else if (e1.id>e2.id) {
				return 1;
			}
			else if (e1.id==e2.id){
				return 1;
			}
			else return 0;
		}

	}

	public static class MyComparator implements Comparator{

		public int compare(Object o1, Object o2) {		
			Employee e1 = (Employee)o1;
			Employee e2 = (Employee)o2;
			if(e1.id<e2.id){
				return -1;
			}
			else if (e1.id>e2.id) {
				return 1;
			}
			else if(e1.id==e2.id){
				return 1;
			}
			else return 0;
		}
	}

	public static void main(String[] args) {
		TreeSet myTreeSet = new TreeSet();
		//		myTreeSet.add(new StringBuffer("Aditya"));
		//		myTreeSet.add("Nikesh");

		myTreeSet.add(new Employee(105, "Donald"));
		myTreeSet.add(new Employee(101, "Aditya"));
		myTreeSet.add(new Employee(102, "Nikesh"));
		myTreeSet.add(new Employee(101, "Aditya"));
		myTreeSet.add(new Employee(103, "Bala"));
		myTreeSet.add(new Employee(104, "Tom"));
		//		Iterator itr = myTreeSet.iterator();
		//		while(itr.hasNext()){
		//			System.out.println(emp.id);
		//		}
		System.out.println(myTreeSet);

		TreeSet myTreeSet2 = new TreeSet(new MyComparator());
		myTreeSet2.add(new Employee(105, "Donald"));
		myTreeSet2.add(new Employee(101, "Aditya"));
		myTreeSet2.add(new Employee(102, "Nikesh"));
		myTreeSet2.add(new Employee(101, "Aditya"));
		myTreeSet2.add(new Employee(103, "Bala"));
		myTreeSet2.add(new Employee(104, "Tom"));
		System.out.println(myTreeSet2);
		
		HashSet myHashSet = new HashSet();
		myHashSet.add(new Employee(105, "Donald"));
		myHashSet.add(new Employee(101, "Aditya"));
		myHashSet.add(new Employee(102, "Nikesh"));
		myHashSet.add(new Employee(101, "Aditya"));
		myHashSet.add(new Employee(103, "Bala"));
		myHashSet.add(new Employee(104, "Tom"));
		System.out.println(myHashSet);
	}



}
