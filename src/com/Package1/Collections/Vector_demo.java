package com.Package1.Collections;

import java.util.Vector;

public class Vector_demo {

	public static void main(String[] args) {
		Vector <Object> vector=new Vector<Object>();
		vector.addElement("prasad");//0
		vector.add("jitendra");//1
		vector.add('A');//2
		vector.add(120.9f);//3
		vector.add("sampu");//4
		vector.add("zomato");//5
		vector.addElement("amazon");//6
		System.out.println(vector);
		vector.removeElement(120.9f);
		vector.remove("jitendra");
		vector.remove(0);
		vector.size();
		System.out.println(vector);
		
		

	}

}
