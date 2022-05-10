package com.syntax.class05;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your height in inches");
		int height=input.nextInt();
		if (height<60) {
			System.out.println("Person is Short");
		}else if(height>=60&& height<=72) {
			System.out.println("Person is Medium");
		}else if (height>72) {
			System.out.println("Person is tall");
		}
		
		// TODO Auto-generated method stub

	}

}
