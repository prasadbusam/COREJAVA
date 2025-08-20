package Conditional_statements;

public class Large_number {

	public static void main(String[] args) {
		int a=100,b=200,c=300;
		if(a>b && a>c) {
			System.out.println("a is a large number :"+a);
		}
		else if(b>a && b>c) {
			System.out.println("b is a large number :"+b);
		}else if(c>b && c>a) {
			System.out.println("c is a large number :"+c);
		}
		else {
			System.out.println("None of the above");
		}
		

	}

}
