package com.Practice_1.Constructor;

public class Student {
	int x;
	int y;
	Student(){
		int x=100;
		int y=100;
		System.out.println(x+y);
		
	}
	Student(int a, int b){
		x=a;
		y=b;
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		Student obj=new Student();
		Student obj1=new Student(100,300);
		

	}

}
