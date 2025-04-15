package com.Practice_1.Encapsulation;

public class Result {

	public static void main(String[] args) {
		Student obj=new Student();
		obj.setAccno(995115629);
		obj.setName("prasad");
		obj.setBal(1000);
		
		System.out.println(obj.getAccno());
		System.out.println(obj.getName());
		System.out.println(obj.getBal());
		

	}

}
