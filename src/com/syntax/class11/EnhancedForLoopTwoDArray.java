package com.syntax.class11;

public class EnhancedForLoopTwoDArray {

	// Create a 2D array of integers
	// develop a program which will identify/print even numbers only
	// Create 2 d array
	// store even and odd numbers in the 2 d array
	// access the elements
	// check the element is even, then add it to sumEven variable
	// check the element is odd, then add it to oddEven vaiable
	// print the values of both variables

	public static void main(String[] args) {
		int[][] array2D = { { 2, 3, 4 }, { 5, 6, }, { 12, 6, 8 } };
		int sumEven = 0;
		int sumOdd = 0;

		for (int[] row : array2D) {

			for (int element : row) {

				if (element % 2 == 0) {
					sumEven += element;
				} else {
					sumOdd += element;
				}
			}
		}
		System.out.println("Sum of even numbers " + sumEven);
		System.out.println("Sum of odd numbers " + sumOdd);
	}
}
