package com.Practice_1.Exceptions;

import java.util.Scanner;

public class Exceptionhandling {

	public static void main(String[] args) {
		System.out.println("program is started");
		Scanner sc=new Scanner (System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		try
		{
		System.out.println(100/num);
		}
		catch(ArithmeticException e) {
			System.out.println("invalid data");
		}
		System.out.println("program is completed");
		System.out.println("program is exited");

	}

}
