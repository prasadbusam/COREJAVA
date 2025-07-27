package com.Practice_1.Exceptions;

public class Checkedexceptions {

	public static void main(String[] args) {
		System.out.println("one");
		System.out.println("two");
		try
		{
		Thread.sleep(10000);
		}
		catch(InterruptedException e)
		{
			System.out.println();
		}
		System.out.println("three");
		System.out.println("four");
	}

}
