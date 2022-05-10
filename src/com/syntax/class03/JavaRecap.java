package com.syntax.class03;

public class JavaRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String dayTime = "morning";
		int date = 22;
		String month = "January";

		// Today is morning of January 22
		// + useed to attach String to anything

		// two types of data types, primitive vs non primitive

		System.out.println("Today is " + dayTime + " of " + month + " " + date);

		// Operators
		// arithmetical=,-,*,/,%,+
		// relational and equality >,>=,<,<=,==,!=(not equal)

		// Result of relational and equality operators ALWAYS boolean value(true or
		// false)
		// if statement is always (boolean)
		// if statement is decision making, if condition is true block of code is
		// executed, if condition is false, block of code will not be executed
		
	//if (boolean condition) {code;}
		//
	

	}

}

//[]--> block of code always brackets will have an opening and closing.
//with out the main method, java can't execute the code.'\

public static void main(String[] args) {
/*
* Scenario: I need to compare 2 numbers and I have to find which is bigger
*/

int num1=100;
int num2=50;

if (num1>num2) {
System.out.println(num1 +” is larger than “+num2);
}

double money =5;
double coffee=5;

//if I have more money than a price of the coffee --> I am buying coffee

if (money=
coffee) {
System.out.println(“I am buying the coffee”);
}

//if(money=coffee) { Error because if condition always must be boolean
//we use double --> because of the wrong operator
//}
}
