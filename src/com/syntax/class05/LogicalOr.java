package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {
		
		String day="Saturday";
		if (day.equals("Monday") || day.equals("Friday")) {
			System.out.println("There is no class");
		}else if (day.equals("Tuesday") || day.equals("wednesday"))
			System.out.println("Manuel Testing Classes");
	if(day.equals("Thursday"))
	{
		System.out.println("review class");
	}else if(day.equals("Saturday")||day.equals("Sunday")) {
		System.out.println("I have Java Classes");
	}
		System.out.println("Code outside of if statement");
	// TODO Auto-generated method stub

	/*
	 * let's ask user what is today day
	 * 
	 * based on the day lets define which class we have
	 * 
	 * if (monday or friday)-->there is no class today else if (tuesday or
	 * wednesday) -->manual else if (thursday)--> reviwew class else if (saturday or
	 * sunday)-->java class
	 * 
	 */

}

}
