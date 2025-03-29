package com.Package1.Collections;

import java.util.LinkedHashSet;

public class LinkedHashSet_demo {

	public static void main(String[] args) {
		LinkedHashSet<Object> a1=new LinkedHashSet<>();
		a1.add("prasad");
		a1.add("srinu");
		a1.add(100);
		a1.add(true);
		a1.add(100.2);
		a1.add("srinu");
		a1.add("prasad");
		System.out.println(a1);
		System.out.println(a1.contains("srinu"));
		System.out.println(a1.size());
		System.out.println(a1.isEmpty());
		System.out.println(a1.remove("srinu"));
	}

}
