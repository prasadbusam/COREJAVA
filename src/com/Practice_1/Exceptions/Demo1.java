package com.Practice_1.Exceptions;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println("Program is started");
		Scanner sc=new Scanner(System.in);
		/*System.out.println("enter a number:");
		int value=sc.nextInt();
		System.out.println(100/value);*///arithmatic exception
		
		/*int a[]=new int[5];
		System.out.println("Enter the position(0-4):");
		int pos=sc.nextInt();
		System.out.println("Enter the value:");
		int val=sc.nextInt();
		a[pos]=val; //ArrayIndexOutOfBoundsException
		System.out.println(a[pos]);*/
		
		/*String s="prasad";
		int num=Integer.parseInt(s);
		System.out.println(num);*///NumberFormatException
		
		String s=null;
		System.out.println(s.length());//NullPointerException
		System.out.println("program is completed");
		System.out.println("program is exited");

	}

}
