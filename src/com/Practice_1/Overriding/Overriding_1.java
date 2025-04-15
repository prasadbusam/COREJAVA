package com.Practice_1.Overriding;

class Ticket{
	int bus() {
		return 300;
	}
}

class Train extends Ticket{
	int bus() {
		return 500;
	}
}

class Flight extends Train{
	int bus() {
		return 2000;
	}
}
	public class Overriding_1 {
	public static void main(String[] args) {
		Train obj=new Train();
		System.out.println(obj.bus());
		Flight ref=new Flight();
		
		System.out.println(ref.bus());

	}

}
