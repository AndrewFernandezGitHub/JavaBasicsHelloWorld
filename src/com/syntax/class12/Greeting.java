package com.syntax.class12;

public class Greeting {
	//if i dont want to hard code it i can 
	void sayHello(String name) {
		System.out.println("Hello "+name);
	}//also works with loops
	void sayHelloHowManyTimes(String name) {
		for (int a=0;a<5;a++) {
			System.out.println("Hello "+name);
		}
	}
	void sayHelloNumberOfTimes(String name,int times) {
		for (int i=0;i<times;i++) {
			System.out.println("Hello "+ name);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeting greeter = new Greeting();
		greeter.sayHello("Andrew");
		greeter.sayHelloHowManyTimes("Bob");
		greeter.sayHelloNumberOfTimes("Joe", 9);


	}

}
