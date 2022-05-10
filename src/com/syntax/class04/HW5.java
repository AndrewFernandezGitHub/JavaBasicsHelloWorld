package com.syntax.class04;

import java.util.Scanner;

public class HW5 {

	public static void main(String[] args) {
		Scanner employed=new Scanner(System.in);
		System.out.println("How many years have you worked here?");
		int years=5;
		years=employed.nextInt();
		if (years>=5) {
			System.out.println("Please enter your salary");
		double	annualSalary=employed.nextDouble();
			if (annualSalary>500000) {
				System.out.println("You get a raise of 5000");
			}else {
				System.out.println("You get a raise of 3000");
			}
		
		// TODO Auto-generated method stub

	}

}}
