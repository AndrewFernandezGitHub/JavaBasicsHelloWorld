package com.grooup.project.code;

import java.util.Scanner;

public class ScannerArrayOtherWay {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the length of the array:");

		int length = sc.nextInt();

		int[] myArray = new int[length];
		int sumArray = 0;

		System.out.println("Enter the elements of the array with the size " + length);

		for (int i = 0; i < length; i++) {
			myArray[i] = sc.nextInt();

			sumArray += myArray[i];

		}

		System.out.println("The sum of the array is " + sumArray);

	}
} // (edited)