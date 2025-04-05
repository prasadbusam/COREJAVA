package com.Practice_1.Cusrors;

import java.util.ArrayList;
import java.util.Iterator;

public class ListIterator_demo {

	public static void main(String[] args) {
		ArrayList<Character> out=new ArrayList<Character>();
		for(char i='a';i<='x';i++) {
			out.add(i);
		}
		System.out.println(out);
		Iterator<Character>com=out.iterator();
		while(com.hasNext()) {
			Character op=com.next();
			System.out.println(op);
			//System.out.println(com.next());
			if(!(op=='a'||op=='e'||op=='i'||op=='o'||op=='u')){
				com.remove();
			}
		}
		System.out.println(out);
		

	}

}
