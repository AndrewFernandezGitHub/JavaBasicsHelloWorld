package com.syntax.class07;

import java.util.Scanner;

public class DoLoopWithScanner {
//want user to guess secret number, if user number matches user number, project stops
//otherwise it should continue asking to guess number
	public static void main(String[] args) {
		int secretNumber=12;
		Scanner input=new Scanner(System.in);
		int guessNumber;
		//enter block of code you want to have repeated in do
		do {
			System.out.println("please enter a number to win");
		guessNumber=input.nextInt();
		}while(guessNumber!=secretNumber);
		System.out.println("Congratulations");
		// TODO Auto-generated method stub

	}

}
