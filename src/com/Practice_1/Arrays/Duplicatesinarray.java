package com.Practice_1.Arrays;

public class Duplicatesinarray {

	public static void main(String[] args) {
		int a[]= {10,30,60,50,20,10,20,90,10};
		int num=20;
		int count=0;
		for(int x:a) {
			if(x==num) {
				count++;
			}
		}
		System.out.println(count);

	}

}
