package com.aditya.collections;

import java.util.Stack;

public class CurlyBraces {

	public static void main(String[] args){
		Stack<Integer> stack = new Stack<Integer>();
		String str = ")(dgfd()sdfd(((ddd(f))())))"; 
		for(int i=0; i<str.length();i++){
			if(str.charAt(i)=='('){
				stack.push(i);
			}
			if(str.charAt(i)==')'&&!stack.empty()){
				System.out.println(stack.peek()+", "+i);
				stack.pop();
			}
		}
	}
}
