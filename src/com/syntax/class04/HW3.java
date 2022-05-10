package com.syntax.class04;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		Scanner city=new Scanner(System.in);
		System.out.println("Input your city");
		String name=city.nextLine();
		System.out.println("Input your temperature");
		int temp=city.nextInt();
		double c=(temp-32)*5/9;
		
		System.out.println("The temperature in "+name+" is "+c+" celsius");
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
