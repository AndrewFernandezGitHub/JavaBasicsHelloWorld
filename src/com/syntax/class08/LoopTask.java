package com.syntax.class08;

public class LoopTask {

	public static void main(String[] args) {
		/*
		 * find out the sum of all even and odd numbers from 1-50
		 */
		int sum = 0;
		int sumOdd=0;

		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}else {
				sumOdd=sumOdd+i;
				
			}
		}
		System.out.println("The sum of all even numbers = "+sum+" and the sum of all odd numbers = "+sumOdd);
	}

}
