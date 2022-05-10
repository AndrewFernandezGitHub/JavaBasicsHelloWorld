package com.syntax.class11;

import java.util.Arrays;

public class TwoDArrayOddAndEven {
//create a 2d array where you will store odd and even numbers
//Develop a program which will identify/print the even numbers only
	/*
	 * create 2d array store even and odd numbers in the array
	 */
	public static void main(String[] args) {
		int[][] array2D= {{5,4,2},{4,3,},{12,6,8}};
		
		for(int i=0;i<array2D.length;i++) {
			
			for (int x=0;x<array2D[i].length;x++) {
				int element=array2D[i][x];
				if(element%2==0) {
					System.out.println(element);
				}
			}
		}
	}
}


	
