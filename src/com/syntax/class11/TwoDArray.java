package com.syntax.class11;

import java.util.Arrays;

public class TwoDArray {
//create a 2d array of integer values.Print the sum of all numbers.
	public static void main(String[] args) {
	//Create the 2d array
	//print the sum of all numbers
	
		int[][] array2D= {{10,10,10},{20,20,20},{30,30,30}};
		//print out the elements of an array with out loops
		//System.out.println(Arrays.toString(array2D));
		//sum all the elements of the array
		for(int i=0;i<array2D.length;i++) {
			System.out.println(Arrays.toString(array2D[i]));
		}
		System.out.println("-----");
		int sum=0;
		//outer loop of array 
		for (int x=0;x<array2D.length;x++) {
			System.out.println(Arrays.toString(array2D[x]));
		//inner loop of array
			for(int y=0;y<array2D[x].length;y++) {
			sum=sum+array2D[x][y];
		}
		}
		System.out.println("sum of array elements is "+sum);

	}

}