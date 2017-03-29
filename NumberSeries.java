package com.aditya.collections;

import java.util.Scanner;

public class NumberSeries {


	public static void main(String[] args) {
		long series=1;
		System.out.println("Enter desired index: ");
		Scanner sc = new Scanner(System.in);
		long j=sc.nextLong();
		long sum=0;
		for(int i=1; i<2*j; i+=2){
			System.out.println(series);
			sum+=series;
			series+=i;
		}
		System.out.println(sum);
	}
}
