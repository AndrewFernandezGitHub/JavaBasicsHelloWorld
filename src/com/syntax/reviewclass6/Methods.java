package com.syntax.reviewclass6;
//when setting up templates for methods, you can remove the public static void method
public class Methods {
	int age;
	String name, lastName, eyeColor, hairColor;
	char gender;
	//the above are the attributes=variables
	//behavior is defined using the methods
	//behaviors in this case can be run,sleep,eat.
	//When you want to have methods, have to specify return type, can be void
	//a method can be a block of code/within the behavior
void run() {
	System.out.println("All humans sleep");
}
void sleep() {
	System.out.println("All humans eat");
}
void eat() {
	System.out.println("Some humans run");
}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	}

}
