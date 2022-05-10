package com.syntax.class07;

import java.util.Scanner;

public class WhileLoopWithScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//for the while statement like this, its exxtra code vs doing it as do
		int secretNumber=12;
		Scanner input=new Scanner(System.in);
		int guessNumber;
		System.out.println("Please enter a number to win");
		guessNumber=input.nextInt();
		
		while (guessNumber!=secretNumber) {
			System.out.println("Please enter a number to win");
			guessNumber=input.nextInt();
		}
		System.out.println("Congratulations");
		
	}

}
