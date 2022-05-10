package com.syntax.class12;

import java.util.Scanner;

public class Dog {
//Attributes,fields,properties
	String name;
	String color;
	String breed;
	char gender;
	int age;
	double weight;
	//behaviors, functions, methods
	void barks() {
		System.out.println("Dog is barking....");
	}
	
	void eat() {
		System.out.println("Dog is eating");
	}
	
	void sleep() {
		System.out.println("Dog is sleeping");
	}
	public static void main(String[] args) {
		//creating an object scooby from class Dog
		Dog scooby=new Dog();
		/*Dog is class
		 * scooby is an object
		 * =is an assignment operator
		 * new is keyword that we use to create the objects of a class
		 * Dog() we are calling the constructor of the class
		 *Scanner scan=new Scanner(System.in);
		 */
		scooby.barks();
		scooby.eat();
		scooby.sleep();

	}

}
