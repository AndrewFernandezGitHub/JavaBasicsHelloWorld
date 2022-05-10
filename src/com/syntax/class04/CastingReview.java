package com.syntax.class04;

public class CastingReview {

	public static void main(String[] args) {
		
		//Casting: Widening and Narrowing
		
		/*
		 * write a program, to check whether number is positive or negative
		 */
		//hw#3
		
		int num=0;
		if (num<0) {
			System.out.println("The number "+num+" is negative");
		}else if (num>0){
			System.out.println("The number "+num+ " is positive");
		}else {
			System.out.println("The number is "+num);
		}
		
		// TODO Auto-generated method stub
		//Write a Java Progrom to check whether number is even or odd.
		
		num = 101;
		if (num%2==0) {
			System.out.println("This "+num+" is an even number");
		}else {
			System.out.println("The"+num+" is an odd number");
		}
		
		//else if practice/testing multiple conditions with a variable that holds multiple values
		
		int month=3;
		if (month==1) {
		System.out.println("January");
		}else if (month==2) {
		System.out.println("February");
		}else if (month==3) {
			System.out.println("March");
		}else if (month==4) {
			System.out.println("April");
		}else if (month==5) {
			System.out.println("May");
		}else if (month==6) {
			System.out.println("June");
		}else if (month==7) {
			System.out.println("July");
		}else if (month==8) {
			System.out.println("August");
		}else if (month==9) {
			System.out.println("September");
		}else if (month==10) {
			System.out.println("October");
		}else if (month==11) {
			System.out.println("November");
		}else if (month==12) {
			System.out.println("December");
		}

	}
}
