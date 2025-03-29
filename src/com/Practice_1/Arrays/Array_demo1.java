package com.Practice_1.Arrays;

public class Array_demo1 {

	public static void main(String[] args) {
		int []ref=new int[5];   //Initialize and then declare
		ref[0]=1;
		ref[1]=2;
		ref[2]=3;
		ref[3]=4;
		ref[4]=5;
		//ref[5]=6; run time error
		System.out.println(ref[2]);
		for(int obj:ref) {
			System.out.println(obj);
		}
		
		int []ref1=new int[5];   //Initialize and then declare
		ref[0]=100;
		ref[1]=200;
		ref[2]=300;
		ref[3]=400;
		ref[4]=500;
		//ref[5]=6; run time error
		System.out.println(ref1[2]);
		for(int obj:ref1) {
			System.out.println(obj);
		}
		String []arr= {"swathi","swetha","prasad","jitendra"};   //initialize and declare
		System.out.println(arr[2]);
		for(String obj:arr) {
			System.out.println(obj);
		}
		
		String []pra[]=new String [2][2];
		pra[0][0]="admin";
		pra[0][1]="admin1";
		pra[1][0]="password1";
		pra[1][1]="password2";
		
		System.out.println("This is for loop");
		for(int i=0;i<pra.length;i++) {
		  for(int j=0;j<pra[i].length;j++) {
			  System.out.println(pra[i][j]);
		  }
		}
		
		System.out.println("This is two dimentional array");
		String []busam[]= {{"kalyan","prasad"},{"laxmi","bharathi"}};
		System.out.println(busam[0][1]);
		

	}

}
