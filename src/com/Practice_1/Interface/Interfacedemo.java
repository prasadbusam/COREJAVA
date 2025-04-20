package com.Practice_1.Interface;

 /*interface Shape {
	 int a=10;
	 int b=20;
	  void rectangle(); //abstrct method
	 
	 static void circle() {
		 System.out.println("This is static method");
	 }
	 
	 default void square() {
		 System.out.println("This is default method");
	 }
}
 
 public class Interfacedemo implements Shape{
	  public void rectangle() {
		 System.out.println("This is abstract method");
	 }
 
 
 
   public static void main (String []args) {
	   Interfacedemo obj=new Interfacedemo();
	   obj.rectangle();
	   obj.square();
	   Shape.circle();
	   
   }
 }*/

interface Shape {
    int a = 10; // Implicitly public, static, and final
    int b = 20; // Implicitly public, static, and final

    void rectangle(); // Abstract method

    // Static method
    static void circle() {
        System.out.println("This is a static method");
    }

    // Default method
    default void square() {
        System.out.println("This is a default method");
    }
}

public class Interfacedemo implements Shape {
    // Implementing abstract method
    public void rectangle() {
        System.out.println("This is an abstract method");
    }

    // Main method to test the code
    public static void main(String[] args) {
        // Create an instance of Interfacedemo
        //Interfacedemo demo = new Interfacedemo();

        // Call the implemented abstract method
        //demo.rectangle();

        // Call the default method
        //demo.square();

        // Call the static method directly using the interface name
        //Shape.circle();

        // Accessing constants (fields in the interface)
        //System.out.println("Value of a: " + Interfacedemo.a);
        //System.out.println("Value of b: " + Interfacedemo.b);
    	
    	Shape sr=new Interfacedemo();
    	sr.rectangle();
    	sr.square();
    	Shape.circle();
    	System.out.println("This is value of a :"+sr.a*sr.b);
    	//System.out.println("This is value of b :"+sr.b);
    }
}

		
		
 
 
 

	