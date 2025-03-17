package com.Practice_1.return_type;

public class Return_typedemo {
	public void m1(int a, int b) {  //method definition
		int c=a+b;     //method implementation
		System.out.println("This is addition :"+c);
	}
	public void m2() {
		int a=10;int b=50;int c=10;
		int d=a+b+c;
		System.out.println("This second method of addition: "+d);
	}
	public int result() {
		int a=10;
		System.out.println("This is return value : "+a);
		return a;
		
	}

	public static void main(String[] args) {
		Return_typedemo obj=new Return_typedemo();
		obj.m1(10, 20);
		obj.m2();   //method call
		int z=obj.result();

	}

}
