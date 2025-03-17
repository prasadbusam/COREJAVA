package com.Practice_1.Transferstatements;

public class Break_condition {

	public static void main(String[] args) {
		String []name= {"Raju","sailu","naga","shiva","kesava"};
		
		System.out.println("This is break statement");
		for(String names:name) {
			System.out.println(names);
			if(names.equals("shiva")) {
				break;
			}
		}
		
		System.out.println("This is continue statement");
		for(String names:name) {
			if(names.equals("naga")) {
				continue;
			}
			System.out.println(names);
		}

	}

}
