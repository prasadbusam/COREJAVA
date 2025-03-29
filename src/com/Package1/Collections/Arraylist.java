package com.Package1.Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<Object> list=new ArrayList<Object> ();
		list.add("prasad");
		list.add(200);
		list.add('A');
		list.add(120.5f);
		list.add(false);
		list.add("lavanya");
		list.add(100);
		list.add('B');
		list.add(180.5f);
		list.add(true);
		boolean obj=list.contains("prasad");
		list.set(0, "rani"); //replace
		list.add(0, "rishan");
		System.out.println(obj);
		System.out.println(list.get(1));
		System.out.println(list.get(4));
		//System.out.println(list);
	    //System.out.println(list.size());
	    
	    ArrayList<Object> list1=new ArrayList<Object> ();
	    /*list1.add("prasad");
		list1.add(200);
		list1.add('A');
		list1.add(120.5f);
		list1.add(false);*/
		list1.add(list);
		System.out.println(list1);
		
		
		
		

	}

}
