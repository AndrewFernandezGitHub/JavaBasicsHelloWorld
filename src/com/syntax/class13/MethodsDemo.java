package com.syntax.class13;

import java.util.Scanner;

public class MethodsDemo {
	//void is type of methods that dont return anything when called
	//checkEvenOdd is the name of the method
	//() we use to pass information from outside
	//int number this is parameter that we can pass to this method when called
	//we can use this variable inside the logic of method
	void checkEvenOdd(int number) {
		if (number%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
		System.out.println(number);
		
	}
	void checkWeather(boolean isRaining) {
		if(isRaining) {
			System.out.println("I am staing home");
		}else {
			System.out.println("Lets go for a walk");
		}}
	void isName(String name) {
		if ("Andrew".equals(name)) {
		System.out.println("Send memes");
	}else if ("Marcela".equals(name)) {
		System.out.println("Doctor");
	}
	}
	
	public static void main(String[] args) {
		MethodsDemo object1=new MethodsDemo();
		object1.checkEvenOdd(123);
		object1.checkEvenOdd(21);
		object1.checkEvenOdd(32);
		object1.checkWeather(false);
		object1.isName("Andrew");
		
	Scanner scan=new Scanner(System.in);
	int number=scan.nextInt();
	//int number2=object1.checkEvenOdd(120);

	}

}
