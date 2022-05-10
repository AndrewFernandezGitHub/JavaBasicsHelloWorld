package com.syntax.class05;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a number");
		int n1=input.nextInt();
		if (n1>=1 && n1<=10) {
			System.out.println("Small Number");
		}else if (n1>=11 && n1<=100) {
			System.out.println("Medium number");
		}else if (n1>=101 && n1<=1000) {
			System.out.println("Large  Number");
		}else {
			System.out.println("undefined");
		}
		
		
		// TODO Auto-generated method stub

	}

}
