package com.syntax.class03;

public class IfStatement {

	public static void main(String[] args) {
		
		/*
		 * Scenario: I need to compare 2 numbers and I have to find which is bigger
		 */
		
		//if statement is decision making, if condition is true block of code is executed, if condition is false, block of code will not be executed
		
		
		int num1=100;
		int num2=50;
		
		if (num1>num2) {
			
		System.out.println(num1+" is larger than "+num2);
		
		double money=5;
		double coffee=5.99;
		//if I have more money than a price of the coffee --> I am buying coffee
		
		if (money>coffee) { System.out.println("I am buying the coffee");
		
		//if(money=coffee) {Error because if condition always must be boolean
		//we use double -->because of the wrong operagtor
		}
		
		}
		
		
		// TODO Auto-generated method stub

	}

}
