package com.Practice_1.Jumpingstatements;

public class Continue_demo {

	public static void main(String[] args) {
		/*for(int i=0;i<=10;i++) {
			if(i==8) {
				continue;
			}
			System.out.println(i);
		}*/
		
		for(int i=0;i<=10;i++) {
			if(i==2 || i==4 || i==6) {
				continue;
			}
			System.out.println(i);
		}

	}

}
