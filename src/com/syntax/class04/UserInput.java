package com.syntax.class04;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);//creating a scanner
		
		System.out.println("Please enter your name");
		//if you want to capture single string --> use next()
		// TODO Auto-generated method stub
		String name=input.next();// type String and hit enter
		System.out.println("Your name is "+name);
		//if you want to capture int -->use nextInt();
		
		System.out.println(name+" please enter your age");
		int age=input.nextInt();//type integer and hit enter
		
		System.out.println("Your name is "+name+" and your age is"+age);

	}

}
