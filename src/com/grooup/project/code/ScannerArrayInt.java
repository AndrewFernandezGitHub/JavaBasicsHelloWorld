package com.grooup.project.code;

import java.util.Scanner;

public class ScannerArrayInt {

	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);
		System.out.println("Enter value press enter ");
		int num1=num.nextInt();
		System.out.println("Enter value press enter ");
		int num2=num.nextInt();
		System.out.println("Enter value press enter ");
		int num3=num.nextInt();
		System.out.println("Enter value press enter ");
		int num4=num.nextInt();
		
		int [] numbers= {num1,num2,num3,num4};
		int size=numbers.length;
		int sum=0;
		for(int i=0;i<size;i++) {
			sum+=numbers[i];
		}
		System.out.println("Sum of all elements in the array= "+sum);
			
		}
		// TODO Auto-generated method stub

	}


