package Super_Final;

class text{
	public void m1(final int a)
	{
		System.out.println(a);
	}
	
	public void m1(final int a, int b)
	{
		System.out.println(a+b);
	}
}

public class Final_keyword {


	public static void main(String[] args) {
		text a1=new text();
		//a1.x=200;
		a1.m1(10);
		a1.m1(10, 20);

	}

}
