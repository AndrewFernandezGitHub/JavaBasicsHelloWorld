package com.syntax.class04;

import java.util.Scanner;

public class HW4 {

	public static void main(String[] args) {
		
		Scanner credit=new Scanner(System.in);
		System.out.println("Do you have a credit card");
		String creditCard=credit.nextLine();
		if (creditCard.equalsIgnoreCase("yes")) {
			System.out.println("What is the balance on the card?");
			double balance=credit.nextDouble();
			if (balance>1000) {
				System.out.println("Pay the balance off immediately");
			}else {
				System.out.println("You can spend more on your credit card");
			}
			
		}else {
			System.out.println("Would you like a credit card");
		}
		
		
		// TODO Auto-generated method stub

	}

}
