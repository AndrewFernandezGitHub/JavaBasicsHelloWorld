package com.syntax.class10;

public class TwoDArrayTask2 {
//how to retrieve and print all elements in array
	public static void main(String[] args) {
		int[][] numbers= {
				{10,20,30,40},
				{100,200,300,400},
				{1000,2000,3000},
		};
		int size=numbers.length;//when used with 2d arrays, gives # of 1d arrays that we stored
		System.out.println(size);//3
		
		int sizeOf1Array=numbers[0].length;
		System.out.println(sizeOf1Array);//4
		
		int sizeOf2Array=numbers[1].length;
		System.out.println("Size of second array = "+sizeOf2Array);
		
		int sizeOf3Array=numbers[2].length;
		System.out.println("Size of third array = "+sizeOf3Array);
		
		//Retrieving all elements from 2D Array
		for (int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers[i].length;j++) {
				System.out.println(numbers[i][j]+" ");
			}
		}
		
		

	}

}
