package com.Package1.Collections;

import java.util.LinkedList;

public class Linkedlist_1 {

	public static void main(String[] args) {
		LinkedList<Object> link=new LinkedList<Object>();
		link.add("prasad");
		link.add(100);
		link.add(500);
		link.add(true);
		link.add('A');
		link.addFirst("jitendra");
		link.addLast("hanuman");
		link.offerFirst("pavan");//Adding elements at the beginning and the end using offerFirst and offerLast
		link.offerLast("kumar");//Adding elements at the beginning and the end using offerFirst and offerLast
		System.out.println(link);
		link.removeFirst();
		link.removeLast();
		link.pollFirst(); // it removes the elements from first
		link.pollLast(); // it removes elements last one 
		
		System.out.println(link);

	}

}
