package com.Practice_1.Arrays;

public class Twodimentional {

	public static void main(String[] args) {
		int a[][]={{100,101},
				   {200,201},
				   {300,301}};
		//<=a.length-1 → number of rows = 3
        //c<=a[r].length-1 → number of columns in row r = 2
		System.out.println("no of rows:"+a.length);
		System.out.println("no of columns:"+a[0].length);
		//System.out.println(a[2][0]);
		for(int r=0;r<=a.length-1;r++) {
			for(int c=0;c<=a[r].length-1;c++) {
				System.out.println(a[r][c]);
			}
			System.out.println();
		}
		

	}

}
