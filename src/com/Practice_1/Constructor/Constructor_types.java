package com.Practice_1.Constructor;

public class Constructor_types {
	public Constructor_types() {
		System.out.println("This is default constructor");
	}
	public Constructor_types(int a,int b) {
		System.out.println(a+" "+b);
	}
	public Constructor_types(String a) {
		System.out.println("This is good thing "+a);
	}
	

	public static void main(String[] args) {
		Constructor_types obj=new Constructor_types(); //default constructor
		Constructor_types obj1=new Constructor_types(10, 20); //parameterized constructor
		Constructor_types obj2=new Constructor_types("generally");

	}

}
