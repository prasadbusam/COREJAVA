package com.Practice_1.Transferstatements;

public class Break_continue_demo {

	public void breakone() {
		System.out.println("This is break statement");
		for(int i=0;i<=11;i++)
		{
			System.out.println(i);
		
			if(i==6) {
				break;
			}
		}
		
		System.out.println();
		System.out.println("This is continue statement");
		for(int i=0;i<=10;i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
			
	}
	

	public static void main(String[] args) {
		Break_continue_demo obj=new Break_continue_demo();
		obj.breakone();

	}

}
