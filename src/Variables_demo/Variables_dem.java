package Variables_demo;

public class Variables_dem {
	int a=20; //instance variable
	static int b=10; //static variable
	public void m1() {
		int c=50; //local variable
		System.out.println(c);
	}

	public static void main(String[] args) {
		Variables_dem obj=new Variables_dem();
		System.out.println(obj.a);
		obj.m1();
		System.out.println(b);
		

	}

	
}
