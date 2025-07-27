package com.Practice_1.Constructor;

public class Constructor_demo {
	Constructor_demo() {
		int a=10;
		int b=30;
		int c=a+b;
		System.out.println("This is addition : "+c);
	}
	public void v1() {
		System.out.println("This is a version one module");
	}

	public static void main(String[] args) {
		Constructor_demo obj=new Constructor_demo();
		obj.v1();

	}

}
