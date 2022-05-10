package com.syntax.class12;

public class Dogg {
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
	void printCompleteInfo() {
		System.out.println("Name is = "+name);
		System.out.println("Breed is = "+breed);
		System.out.println("Age is = "+age);
		System.out.println("Weight is = "+weight);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
