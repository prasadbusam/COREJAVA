package com.Practice_1.String_concepts;

import java.util.Arrays;

public class Test_2 {

	public static void main(String[] args) {
		String s1="Dhanush";
		String s2="Kumar";
		String s3="Sampangi";
		System.out.println("Concatination : "+ s1+s2+s3);
		String s4="   Prasad    ";
		System.out.println(s4);
		System.out.println(s4.trim());
		System.out.println(s3.charAt(6));
		System.out.println(s3.contains("Sam"));
		String s5="welcome";
		System.out.println(s5.contains("wel"));
		System.out.println(s1.equals("dhanush"));
		System.out.println(s1.equalsIgnoreCase("dhanush"));
		System.out.println(s1.substring(0, 5));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		String x="Zomato";
		System.out.println(x.replace('o', 'T'));
		
		String s11="prasad@gmail.com";
		String a[]=s11.split("@");
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		String b1="jittu@gmail.com";
		String h[]=b1.split("@");
		System.out.println(Arrays.toString(h));
		
		String amount="$78,76,23";
		System.out.println(amount.replace("$", "").replace(",", ""));
		
		String c1="abc,123@bhu";
		System.out.println(c1.replace(",", "").replace("@", ""));
		
		
		
		

	}

}
