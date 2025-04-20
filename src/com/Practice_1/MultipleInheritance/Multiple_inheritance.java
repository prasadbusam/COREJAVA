package com.Practice_1.MultipleInheritance;

public class Multiple_inheritance extends class2 implements I1,I2{
	
	
	public void m1() {
		System.out.println(z);
	}
	
	public void m2() {
		System.out.println(y);
	}

	public static void main(String[] args) {
		Multiple_inheritance obj=new Multiple_inheritance();
		obj.m1();
		obj.m2();
		obj.m3();

	}

}
