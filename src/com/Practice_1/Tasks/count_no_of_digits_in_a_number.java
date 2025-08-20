package com.Practice_1.Tasks;

public class count_no_of_digits_in_a_number {

	public static void main(String[] args) {
		int num=12345;
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println(count);

	}

}
