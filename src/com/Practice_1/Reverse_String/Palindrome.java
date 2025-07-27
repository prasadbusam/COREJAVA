package com.Practice_1.Reverse_String;

public class Palindrome {

	public static void main(String[] args) {
		String s="madam";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		if(rev.equals(s)) {
			System.out.println("This is palindrom");
		}
	}


}
