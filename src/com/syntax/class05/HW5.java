package com.syntax.class05;

import java.util.Scanner;

public class HW5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your quiz score");
		int score1=input.nextInt();
		System.out.println("Please enter your mid term score");
		int score2=input.nextInt();
		System.out.println("Please enter your final score");
		int score3=input.nextInt();
		
		int avg=(score1+score2+score3)/3;
		
		if (avg>=90) {
			System.out.println("A");
		}else if (avg>=70 && avg<90) {
			System.out.println("B");
		}else if (avg>=50 && avg<70) {
			System.out.println("C");
		}else if (avg<50){
			System.out.println("F");
		}
		
		
		// TODO Auto-generated method stub

	}

}
