package com.syntax.class06;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please Enter the first number");
		double n1=input.nextDouble();
		System.out.println("Please enter the operator");
		String operator=input.next();
		System.out.println("Please enter the second number");
		double n2=input.nextDouble();
		double result=0;
		switch (operator) {
		case "+":
			result=n1+n2;
			break;
		case "-":
			result=n1-n2;
			break;
		case "/":
			result=n1/n2;
			break;
		case "*":
			result=n1*n2;
			break;
		default:
			System.out.println("Error");
		}
		
		System.out.println(n1+" "+operator+" "+n2+"="+result);
		
		// TODO Auto-generated method stub

	}

}
