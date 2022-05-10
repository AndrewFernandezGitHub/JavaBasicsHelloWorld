package com.syntax.class05;

import java.util.Scanner;

public class PossibleIssues {

	public static void main(String[] args) {
		
		//next() vs nextLine();
		Scanner scan=new Scanner(System.in);
		System.out.println("Capturing values using next");
		
		String value=scan.next();//nextInt();nextDouble();nextBoolean();next().chartAt(0)
		System.out.println(value);
		
		scan.nextLine();
		
		System.out.println("Capturing values using nextLine");
		
		String anotherValue=scan.nextLine();
		System.out.println(anotherValue);
		
		System.out.println("End of the program");
		
		
		// TODO Auto-generated method stub

	}

}
