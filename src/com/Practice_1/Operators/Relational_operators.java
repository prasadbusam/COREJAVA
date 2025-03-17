package com.Practice_1.Operators;

import java.util.Scanner;

public class Relational_operators {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("True/False :"+(a>b));
		System.out.println("True/False :"+(a<b));
		System.out.println("True/False :"+(a>=b));
		System.out.println("True/False :"+(a<=b));
		System.out.println("True/False :"+(a!=b));
	}

}
