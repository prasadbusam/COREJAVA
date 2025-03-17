package com.Practice_1.String_concepts;

public class Test_1 {

	public static void main(String[] args) {
		String str="prasad";
		String output=str.toUpperCase();
		System.out.println(output);
		
		String a1="jitendra";
		String a2="samantha";
		System.out.println(a1.toLowerCase());
		System.out.println(a1.toUpperCase());
		System.out.println(a1.length());
		System.out.println(a1.equals(str));
		System.out.println(a1.equalsIgnoreCase(a2));
		System.out.println(a1.charAt(4));// it print only particular character only
		System.out.println(a1.indexOf('d'));
		
		System.out.println();
		
		String name="This is prasad from machilipatnam";
		System.out.println(name);
		String []names=name.split(" ");
		System.out.println("This is for each loop");
		for(String nam:names) {
			System.out.println(nam);
		}
		/*System.out.println("This is for loop");
		for(int name1=0;name1<=3;name1++) {
			System.out.println(name);
		}*/
		System.out.println();
		
		char [] num =name.toCharArray();
		for(char nom:num) {
			System.out.println(nom);
		}

	}

}
