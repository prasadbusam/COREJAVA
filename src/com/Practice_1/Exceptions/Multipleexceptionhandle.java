package com.Practice_1.Exceptions;

import java.util.Scanner;

public class Multipleexceptionhandle {

	public static void main(String[] args) {
		System.out.println("program is startd");
		/*Scanner sc=new Scanner (System.in);
		String num=sc.nextLine();
		int inpiu=Integer.parseInt(num);
		System.out.println("Enter the name:"+inpiu);*/
		String s=null;
		try
		{
		System.out.println(s.length());
		}
		catch(Exception e)
		{
			System.out.println("Handled exception");
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("You entered into finally block");
		}
		System.out.println("program is completed");
		

	}

}
