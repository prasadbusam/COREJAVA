package com.Package_1.Inheritance;

class l{
	int a;
	void python() {
		System.out.println(a);
	}
}
class k extends l{
	int x;
	void zoo() {
		System.out.println(x);
	}
}

class c extends k{
	int v;
	void ts() {
		System.out.println(v);
	}
}

class d extends c{
	int n;
	void quality() {
		System.out.println(n);
	}
}

public class Multilevel_Inheritance1 {

	public static void main(String[] args) {
		d obj=new d();
		obj.x=10;
		obj.v=20;
		obj.n=30;
		obj.a=40;
		obj.python();
		obj.zoo();
		obj.ts();
		obj.quality();
		
		

	}

}
