package com.Package_1.Inheritance;

class a{
	int x=12;
	void prasad() {
		System.out.println(x);
	}
}
	
	class b extends a{
		String z="ram";
		void jitendra() {
			System.out.println(z);
		}
	}

public class Single_Inheritance1 {

	public static void main(String[] args) {
		b obj=new b();
		System.out.println(obj.x);
		System.out.println(obj.z);
		obj.prasad();
		obj.jitendra();
		
		
		
		

	}

}
