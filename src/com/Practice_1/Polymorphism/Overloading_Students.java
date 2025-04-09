package com.Practice_1.Polymorphism;

public class Overloading_Students {
	public void m1() {
		System.out.println("This is m1 method");
	}
	
	public void m1(int a, int b) {
		System.out.println("This is m1 method:"+a+", "+b);
	}
	
	public void m1(int a, String name) {
		System.out.println("This is m1 method:"+a+", "+name);
	}
	
	public void m1(String name, int a) {
		System.out.println("This is m1 method:"+name+", "+a);
	}

	public static void main(String[] args) {
		Overloading_Students obj=new Overloading_Students();
		obj.m1();
		obj.m1(10, 20);
		obj.m1(20, "prasad");
		obj.m1("jitendra", 30);

	}

}
