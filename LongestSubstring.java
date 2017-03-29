package com.aditya.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.TreeSet;

public class LongestSubstring {

	public static void main (String[] args){
		String s = "abcabcdaabbmnopq";
		Stack myStack = new Stack();
		TreeSet ts = new TreeSet();
		for(int i=0; i<s.length();i++){
			if(!myStack.contains(s.charAt(i))){
				myStack.push(s.charAt(i));	
				System.out.println(myStack.toString());
			}
			else{
				ts.add(myStack.toString());
				myStack.clear();
				i--;
			}
		}
//		System.out.println(myStack.toString());
	
		System.out.println(ts.toString());
	}
}
