package com.aditya.channels;

public class SwapArray {

	public static void main(String[] args) {
		int[] arr1 = {9,4,6,2,1,0,7,3,8,5};
		String str = "";
		for(int i=0; i<arr1.length; i++){
			str +=arr1[i];
		}
		int[] arr2 = new int[10];
		for (int i=0; i<str.length(); i++){
			arr2[i]=str.indexOf(i+"");			
			System.out.println(arr2[i]);
		}
	}
}
