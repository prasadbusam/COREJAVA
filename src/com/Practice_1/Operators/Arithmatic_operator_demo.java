package com.Practice_1.Operators;

import java.util.Scanner;

public class Arithmatic_operator_demo {

	public static void main(String[] args) {
		int a;
		int b;
		System.out.println("Enter a value");
		System.out.println("Enter b value");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Addition :"+(a+b));
		System.out.println("Substraction :"+(a-b));
		System.out.println("Multiplication :"+(a*b));
		System.out.println("Division "+(a/b));
		System.out.println("modulo :"+(a%b));

	}

}
