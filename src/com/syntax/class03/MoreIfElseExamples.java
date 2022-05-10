package com.syntax.class03;

public class MoreIfElseExamples {

	public static void main(String[] args) {
		
		/*
		 * we need to decalre a boolean variable hungry yes or no
		 * if we are hungry--> i am going to eat
		 * otherwise-->I am going to drink a tea 
		 */
		
		boolean hungry=true;
		
		if (hungry==true) {
			System.out.println("I am going to eat");
		}else {
			System.out.println("I am going to drink a tea");
		}
		
		boolean traffic=false;
		
		if(traffic) {
			System.out.println("I am coming home late");
		
		}else {
			System.out.println("No traffic, I am on time");
		}
		
		//if browser is chrome-->we are executing tests on chrome
		//otherwise-->i am not exectuing any test cases
		
		String browser="chrome";
		
		//to string together two booleans us browser.equals("insert text here");
		
		if (browser.equals("chrome")) {
			System.out.println("we are executing tests on chrome");
		}else {
			System.out.println("we are not executing any test cases");
		}
		// TODO Auto-generated method stub

	}

}
