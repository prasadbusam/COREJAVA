package com.Practice_1.restassure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Restassure_data {

	public static void main(String[] args) {
		Map<String, Integer> data=new HashMap<>();
		data.put("prasad",80);
		data.put("zabbar", 70);
		Integer pmark=data.get("prasad");
		System.out.println(pmark);
		
		Set <String>all=data.keySet();
		//Iterator ,convert set into list
		List<String>li=new ArrayList<>(all);
		for(int i=0;i<li.size();i++)
		{
			String a1=li.get(i);
			System.out.println(data.get(a1));
		}
		

	}

}
