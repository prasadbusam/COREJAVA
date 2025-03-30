package com.Package1.Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest1 {

	public static void main(String[] args) {
		HashMap<String, String> map=new HashMap<>();
		map.put("Admin", "Prasad@123");
		map.put("Stores", "Store@123");
		map.put("Front", "FE$123");
		map.put("Testing", "Testing%444");
		
		System.out.println(map);            
		for(Map.Entry<String, String>data:map.entrySet()) { //map.entrySet() this method store the all the keys and values
			System.out.println(data.getKey());   //Map.Entry<String, String> this method take the one after one entry means one by one set keys and values
			System.out.println(data.getValue());
			
			System.out.println();
			/*Set da=map.keySet();
			System.out.println(da);
			
			Collection ca=map.values();
			System.out.println(ca);*/
		}

	}

}
