package com.Package1.Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMap_demo {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<>();
		map.put(1, "prasad");
		map.put(2, "Jitendra");
		map.put(3, "Nani");
		map.put(4, "Mahesh");
		map.put(5, "Aravind");
		map.put(3, "Sai");
		map.put(1, "Zabbar");
		map.put(4, "Krishna");
		
		System.out.println(map);
		Set obj=map.keySet();
		//System.err.println(obj);
		System.out.println(obj);
		Collection mark=map.values();
		System.out.println(mark);

	}

}
