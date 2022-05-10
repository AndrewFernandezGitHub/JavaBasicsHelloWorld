package com.syntax.class08;

import java.util.Scanner;

public class LoopTask3 {
/*
 * create prgoram to keep asking to apply for credit card. 
 * when you get yest from program, stop asking
 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String answer;
		do {
			System.out.println("Do you want to aplpy for a credit card");
			answer=input.next();
		}while (!answer.equalsIgnoreCase("yes"));
		System.out.println("congrats, heres your card");
		// TODO Auto-generated method stub

	}

}
