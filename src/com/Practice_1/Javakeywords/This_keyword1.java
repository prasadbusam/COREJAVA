package com.Practice_1.Javakeywords;

public class This_keyword1 {
	int x;
	int y;
	public void student(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public void display() {
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		This_keyword1 obj=new This_keyword1();
		obj.student(10, 90);
		obj.display();
	}
}
