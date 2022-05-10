package com.syntax.class11;

public class FibonacciSeriesCode {

	public static void main(String[] args) {
		//Write program to print first 10 numbers of fibonacci series
		//FIbonacci Series.0 1 1 2 3 5 8 13 21 34
		//store the number of Fibonacci numbers we want to producde
		//start from 0 and 1
		//add the previous numbers to produce next number
		//check if we have printed required numbers or not
		int howMany=10;
		int previous=0;
		int current=1;
		int next=0;
		System.out.println(previous+" ");
		System.out.println(current+" ");
		for(int i=0;i<howMany-2;i++) {
			next=previous+current;
			System.out.println(next+" ");
			previous=current;
			current=next;
		}

	}

}
