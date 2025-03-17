package com.Practice_1.return_type;

public class Return_demo {
	public void maths(int a, int b) {
		if(a>b) {
			System.out.println("A value is greater than B");
		}else {
			System.out.println("B value is less than A");
		}
	}
	
	public int maths2() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		return c;
		
	}
	
	public String maths3(int a, int b) {
		if(a>b){
		
			return "A is greater than B";
		}else {
			
			return "B is greater than A";
			
		}	 
	}
	
	public boolean compareNumber(int a, int b) {
		if(a>b) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		Return_demo obj=new Return_demo();
		obj.maths(10, 5);
		int z=obj.maths2();
		String y=obj.maths3(10, 20);
		System.out.println(y);
		boolean x=obj.compareNumber(90, 100);
		System.out.println(x);

	}

}
