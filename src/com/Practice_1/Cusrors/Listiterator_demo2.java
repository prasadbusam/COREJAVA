package com.Practice_1.Cusrors;

import java.util.ArrayList;
import java.util.ListIterator;

public class Listiterator_demo2 {

	public static void main(String[] args) {
		ArrayList<String> ui=new ArrayList<>();
		ui.add("prasad");
		ui.add("bala");
		ui.add("swami");
		ui.add("gani");
		System.out.println(ui);
		
		ListIterator<String>op=ui.listIterator();
		System.out.println("This is forward direction");
		while(op.hasNext()) {
			String rt=op.next();
			System.out.println(rt);
			
			if(rt.equals("bala")) {
				op.set("tulasi");  //set is replace the value...
			}else if(rt.equals("prasad")) {
				op.add("jitendra");
			}else if(rt.equals("swami")) {
				op.remove();
			}
		}
		System.out.println(ui);
		
		System.out.println();
		
		System.out.println("This is backend direction");
		
		while(op.hasPrevious()) {
			String tr=op.previous();
			System.out.println(tr);
		}

	}

}
