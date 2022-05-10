package com.syntax.class02;

public class CreatingVariables {

	public static void main(String[] args) {

		/*
		 * create a variable and assign a value
		 * 
		 * declare a variable and initialize
		 */
		// 1
		int age = 25;

		// 2
		int num; // declare variable
		num = 10;// initialize it
		num = 100;// reassign the value

		int n1, n2, n3; // all 3 variables are on the int type

		n1 = 10;
		n2 = 20;
		n3 = 30;

		// cmd+d--> will remove entire line

		// can I change a value of the variable?

		age = 26; // reassigning value of variable age

		// ag =26.5; ERROR: age variable can hold only int value

		age = 57;
		age = 75;

		// age will print at last value, code is read from top down, left to right

		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(num);
		System.out.println(age);

		boolean Break = true;
		// Java Rules for identifiers

		// boolean break=false; ERROR --> 1. do not use keyword as identifier
		// char 1character='A"; ERROR -->2. do not start identifier (name) with numbers
		// or special characters
		// double%value=12.99; Error --> 2. do not start identifier (name)

		// Java allows to use _ or $ as identifier
		double $price1 = 12.99;
		double _value = 2.99;
		char character1 = 'a';

		// not rules but preferences

		/*
		 * variable and methods should start with lower case give variable a meaningful
		 * name(storing a number name it a number, price a price, age a age)
		 * 
		 * class names should start with upper case
		 *
		 * if name hase 2 or more words --> follow CamelCasing (no space, uppercase new
		 * word)
		 *
		 */

		int bignumber = 12345;

		// TODO Auto-generated method stub

	}

}
