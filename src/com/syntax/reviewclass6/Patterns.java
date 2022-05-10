package com.syntax.reviewclass6;

public class Patterns {

	public static void main(String[] args) {
		// 5 columns then go next row and repeat
		// outer loop controls the rows
		// inner loop controls the columns
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println("----------");

		for (int row = 1; row <= 4; row++) {

			for (int col = 1; col <= 5; col++) {

				System.out.print("*");
			}
			System.out.println();

		}

	}
}