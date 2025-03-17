package com.Practice_1.Iterativestatements;

public class While_loop {

	public static void main(String[] args) {
		String [] arr= {"zoom","loop","for","api","selenium","java","python"};
		for(int i=0;i<=3;i++) {
			System.out.println("This is for loop :"+arr[i]);
		}
		for(String pra:arr) {
			System.out.println("This is for each loop :"+pra);
		}
		int j=0;
				while(j<=4) {
					System.out.println("This is while loop :"+arr[j]);
					j++;
				}
				
				int a=10;
				do {
					System.out.println("This is do while loop: "+a);
					a++;
				}while(a<=13);

	}

}
