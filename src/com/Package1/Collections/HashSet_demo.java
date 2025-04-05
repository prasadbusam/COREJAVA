package com.Package1.Collections;

import java.util.HashSet;

public class HashSet_demo {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<>();
		set.add("prasad");
		set.add("prasad");
		set.add("jitendra");
		set.add("aravind");
		set.add("sai");
		set.add("ravi");
		System.out.println(set);
		System.out.println(set.contains("prasad"));
		System.out.println(set.size());
		System.out.println(set.remove("ravi"));
		System.out.println(set.isEmpty());
	
		
		for(String set1:set) {
			System.out.println(set1);
		}
		
		for(int i=0;i<set.size();i++) {
			System.out.println(set);
		}
			

	}

}
