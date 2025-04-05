package com.Practice_1.Cusrors;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_demo {

	public static void main(String[] args) {
		ArrayList<Object> list=new ArrayList<Object>();
		list.add("prasad");
		list.add("yesu");
		list.add("anil");
		list.add("ravi");
		list.add("queen");
		System.out.println(list);
		Iterator<Object>man=list.iterator();
		while(man.hasNext()) {
			Object out=man.next();
			System.out.println(out);
			if(out.equals("prasad")){
				man.remove();
			}
		}
		System.out.println(list);
		

	}

}
