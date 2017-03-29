package com.aditya.channels;

public class DelDel {

	public static void main(String[] args) {
		String str = "delkittendeldogdelmousedel";
		while(str.contains("del")){
			for(int n=0; n<=(str.length()-3); n++){
				System.out.println(n);
				if (str.substring(n, n+3).equals("del")){
					str = str.substring(0, n)+str.substring(n+3, str.length());
				}
			}
		}
		System.out.println(str);
	}
}
