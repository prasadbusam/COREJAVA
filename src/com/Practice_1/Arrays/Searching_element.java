package com.Practice_1.Arrays;

public class Searching_element {

	public static void main(String[] args) {
		int a[]= {100,200,300,900};
		int search_element=0;
		boolean status=false;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]==search_element) {
				System.out.println("Element found");
				status=true;
				break;
				
			}
		}
		if(status==false) {
			System.out.println("Element not found");
		}

	}

}
