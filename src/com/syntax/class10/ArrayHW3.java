package com.syntax.class10;

public class ArrayHW3 {

	public static void main(String[] args) {
		int[] numbers= {15,45,10,32};
		int size=numbers.length;
		int sum=0;
		for(int i=0; i<size;i++){
			sum+=numbers[i];
		}
		System.out.println("Sum of all elements in the array= "+sum);
		sum=0;
		for(int num:numbers) {
			System.out.println("Sum of all elements in the array= "+num);
		}

	}

}
