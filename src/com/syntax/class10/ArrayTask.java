package com.syntax.class10;

public class ArrayTask {
//create array and retrieve all elements in reverse order
	public static void main(String[] args) {
		int[] numbers= {10,20,30,40,50,60};
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
			//^how to print it going forward
		}
		for(int i=numbers.length-1;i>=0;i--) {
			System.out.println(numbers[i]);
		}//how to print it in reverse order going backwards
	}

}
