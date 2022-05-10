package com.syntax.class07;

import java.util.Scanner;

public class HW6 {

	public static void main(String[] args) {
		int priceActual=6;
		Scanner input=new Scanner(System.in);
		int priceGuess;
		
		do {
			System.out.println("Please pay for cofee by entering amount");
		priceGuess=input.nextInt();
		}while (priceGuess!=priceActual)
		// TODO Auto-generated method stub

	}

}
