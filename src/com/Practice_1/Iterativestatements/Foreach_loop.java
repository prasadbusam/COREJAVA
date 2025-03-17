package com.Practice_1.Iterativestatements;

public class Foreach_loop {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6,7,8,9};
		for(int obj:arr) {
			System.out.println("This is for each loop :"+obj);
		}
		
		for(int i=1;i<=3;i++) {
			System.out.println("This is for loop :"+arr[i]);
		}

	}

}
