package com.Package_1.Inheritance;

class parent{
	void rice(int a) {
		System.out.println(a);
	}
}

class child1 extends parent {
	void curry(int b) {
		System.out.println(b);
	}
}

class child2 extends parent{
	void milk(int c) {
		System.out.println(c);
	}
}

public class Hierarchy_inheritance {

	public static void main(String[] args) {
		child1 obj=new child1();
		obj.rice(90);
		obj.curry(20);
		
		child2 ref=new child2();
		ref.rice(100);
		ref.milk(40);

	}

}
