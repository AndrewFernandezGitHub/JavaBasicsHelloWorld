package com.syntax.class06;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter first number");
		double n1=input.nextDouble();
		System.out.println("Please enter the operator");
		char operator=input.next().charAt(0);
		System.out.println("Please enter the second number");
		double n2=input.nextInt();
		double result=0;
		if (operator=='+') {
			result=n1+n2;
		}else if (operator =='-') {
			result=n1-n2;
		}else if (operator =='*') {
			result=n1*n2;
		}else if (operator =='/') {
			result=n1/n2;
		}else {
			System.out.println("error");
		}
		System.out.println(n1+" "+operator+" "+n2+" "+result);
		
		
		// TODO Auto-generated method stub

	}

}
