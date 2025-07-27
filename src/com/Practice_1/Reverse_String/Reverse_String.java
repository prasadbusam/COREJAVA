package com.Practice_1.Reverse_String;

public class Reverse_String {

	public static void main(String[] args) {
		String s="Prasad";
		String rev="";//rev is an empty string used to store the reversed result.
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println("Print reverse string : "+rev);

	}

}
