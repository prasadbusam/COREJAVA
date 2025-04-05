package com.Practice_1.Cusrors;

import java.util.Enumeration;
import java.util.Vector;
public class Enumeration_demo {

	public static void main(String[] args) {
		Vector<Object> vector=new Vector<>();
		vector.addElement("prasad");
		vector.add("vamsi");
		vector.add("Ravi");
		vector.add("gopi");
		System.out.println(vector);
		
		 Enumeration<Object>dal=vector.elements();
		 while(dal.hasMoreElements()) {
			 Object output=dal.nextElement();
			 System.out.println(output);
		 }

	}

}
