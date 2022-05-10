package com.syntax.class06;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter grade");
		char grade=input.next().charAt(0);
		String exp;
		
		switch(grade) {
		case 'A':
			exp="Excellent";
			break;
		case 'B':
			exp="Good";
			break;
		case 'C':
			exp="Average";
		case 'D':
			exp="Bad";
			break;
		default:
			exp="Not Acceptable";
		}
		System.out.println("Your grade is "+grade+" - "+exp);
		
		// TODO Auto-generated method stub

	}

}
