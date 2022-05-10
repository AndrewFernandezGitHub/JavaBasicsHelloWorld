package com.syntax.class08;

import java.util.Scanner;

public class LoopHWSecretNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double price=2.99;
		System.out.println("Please Pay for your coffee");
		Scanner input=new Scanner(System.in);
		double pay;
		
		do {
			pay=input.nextDouble();
			if (pay>=3) {
				System.out.println("Please give less money");
				pay=input.nextDouble();
			}else if (pay<3) {
				System.out.println("Please give more money");
			}
		} while (pay!=price);
		System.out.println("Please enjoy your cofee");
}
}