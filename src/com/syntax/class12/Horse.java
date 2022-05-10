package com.syntax.class12;
//Horse is a class you are creating with behaviors or attributes
public class Horse {
	//you can use the attributes
	String name;
	String breed;
	int age;
	double weight;
	
	void run() {
		System.out.println(name+" is running");
	}
	//voids are behaviors, methods, or functions
	void eat() {
		System.out.println(name+" is eating");
	}
	void printCompleteInfo() {
		System.out.println("Name is = "+name);
		System.out.println("Breed is = "+breed);
		System.out.println("Age is = "+age);
		System.out.println("Weight is = "+weight);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Horse rush=new Horse();
		rush.name="rush";
		rush.breed="stallion";
		rush.age=20;
		rush.weight=400;
		rush.run();
		rush.printCompleteInfo();
		
		Horse drew=new Horse();
		drew.name="Bob";
		drew.breed="Mustang";
		drew.age=12;
		drew.weight=450;
		drew.run();
		drew.printCompleteInfo();
		

	}
	

}
