package com.syntax.class07;

public class ForLoop {
//for loop is great when you know how many lines need to be printed
	public static void main(String[] args) {
		//I want to say hello 5 times
		// TODO Auto-generated method stub
		//initialization, condition, increment or decrement
		for (int i=1;i<=5;i++) {
			System.out.println("hello");
		}//int is start point, I is endpoint, then increment or decrement
		System.out.println("I need to print numbers 1-20");
		for (int i=1;i<=20;i++) {
			System.out.print(i+" ");
		}
		System.out.println("I need to print from 10-25");
		for (int i=10;i<=25;i++) {
			System.out.print(i+" ");
		}
		System.out.println("I need to print from 50 to 1");
		for (int i=50;i>=1;i--) {
			System.out.print(i+" ");
		}
		
		
	} 
	

}
