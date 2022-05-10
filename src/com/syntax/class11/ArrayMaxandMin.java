package com.syntax.class11;

public class ArrayMaxandMin {

	public static void main(String[] args) {
		//Maximum and minimum in the array
		int[]arr= {10,20,30,40,50,70,};
		int largest=arr[0];
		int smallest=arr[0];
		for (int elements:arr) {
			if(elements>largest) {
				largest=elements;
			}
			if (elements<smallest) {
				smallest=elements;
			}
		}
		System.out.println("Largest number is "+ largest);
		System.out.println("Smallest number is "+ smallest);
	}

}
