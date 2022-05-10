package com.syntax.class10;

public class ArrayHW4 {

	public static void main(String[] args) {
		int[] number = { 100, 45, 10, 32 };
		int largest = number[0];
		for (int n = 0; n < number.length; n++) {
			if (number[n] > largest) {
				largest = number[n];
			}
		}
		System.out.println(largest);
		// can also be written as
		for (int n = 1; n < number.length; n++) {
			if (number[n] > largest) {
				largest = number[n];
			}
		}//can also be written ass
		System.out.println(largest);
		largest = number[0];
		for (int num : number) {
			if (num > largest) {
				largest = num;
			}
		}
		System.out.println(largest);
	}
}