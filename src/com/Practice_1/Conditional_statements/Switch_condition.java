package com.Practice_1.Conditional_statements;

public class Switch_condition {

	public static void main(String[] args) {
		String course="Cypress";
		switch (course) {
		case "api":System.out.println("Enter API class demo");break;
		case "manual":System.out.println("Enter Manual class demo");break;
		case "sql":System.out.println("Enter SQL class demo");break;
		case "Selenium":System.out.println("Enter Selenium class demo");break;
		default:System.out.println("Go and ask management");
	    break;
		}

	}

}
