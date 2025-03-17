package com.Practice_1.Operators;

import java.util.Scanner;

public class Logicaloperators {

	public static void main(String[] args) {
		int a;
		int b;
		System.out.println("Enter a and b values");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("This is AND Logical operator");
		System.out.println((a>b)&&(a>b));
		System.out.println((a>b)&&(a<b));
		System.out.println((a<b)&&(a>b));
		
		System.out.println("This is OR Logical operator");
		System.out.println((a>b)||(a>b));
		System.out.println((a>b)||(a<b));
		System.out.println((a<b)||(a>b));
		
		System.out.println("This is NOT Logical operator");
		System.out.println(!(a>b));
		

	}

}
