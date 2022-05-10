package com.syntax.class08;

import java.util.Scanner;

public class LoopRepeatNameHW {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		for (int i=1; i<5;i++) {
		System.out.println("Please enter your first name");
		String name=input.nextLine();
		
		System.out.println("Please enter your last name");
		String lName=input.nextLine();
		
		System.out.println("Please enter your age");
		int age=input.nextInt();
		
		input.nextLine();
		
		System.out.println("Your name is "+name+" "+lName+" and you are"+age+" years old");
		// TODO Auto-generated method stub

	}
	}
}
