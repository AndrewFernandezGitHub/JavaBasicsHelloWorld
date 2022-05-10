package com.syntax.class11;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerInputSumAnswers {
/*Create an array on int values using a scanner
 * and calculate sum of all stored elements in that array 
 */
	public static void main(String[] args) {
		//step 1 create the array
		//Take the size of the array using scanner class from user
		//create an int array of above size
		//fill the array with elements from user scanner class
		//sum all the elements of the array
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter the size of the array");
		int size=scanner.nextInt();
		System.out.println("Size of the Array "+size);
		int[] array=new int[size];
		
		System.out.println("Please Enter "+size+" element");
		for (int i=0;i<size;i++) {
			System.out.println("Please enter the element for index "+i);
			array[i]=scanner.nextInt();
		}
		//print out the elements of an array with out loops
		System.out.println(Arrays.toString(array));
		//sum all the elements of the array
		int sum=0;
		for (int x=0;x<size;x++) {
			sum=sum+array[x];//shorthand is sum+=array[x]
		}
		System.out.println("sum of array elements is "+sum);

	}

}
