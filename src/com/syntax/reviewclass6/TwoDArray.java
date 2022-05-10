package com.syntax.reviewclass6;

import java.util.Arrays;

public class TwoDArray {

	public static void main(String[] args) {
		int[][] array = new int[2][3];// first number is how many arrays,second number is number of values inside
										// array
		// 1 row
		array[0][0] = 10;
		array[0][1] = 20;
		array[0][2] = 30;

		// 2 row
		array[1][0] = 10;
		array[1][1] = 20;
		array[1][2] = 30;

		// array.length will give number of 1 d arrays within the 2d array
		// each 1d array is one element
		System.out.println(array.length);// 2 1d arrays
		// ^long way below is short way
		int[][] numbers = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 }, { 13, 14, 15 } };
		System.out.println(numbers.length);// 5 1 d elements
		/*
		 * how to retrieve all elements from 2D array a nested loop will be needed to
		 * call all elements from arrays using their index
		 */
		for (int row = 0; row < numbers.length; row++) {
			for (int col = 0; col < numbers[row].length; col++) {
				System.out.print(numbers[row][col]);
			}System.out.println();
		}System.out.println(" Get all elements from 2d array using for each loop");
		for (int[] nums:numbers) {
			for(int num:nums) {
				System.out.print(num+" ");
			}System.out.println();
		}
		int [] arr= {10,90,20,33,44};
		
		Arrays.sort(arr);//sorts the array from highest to lowest int
		System.out.println(arr[arr.length-1]);

	}

}
