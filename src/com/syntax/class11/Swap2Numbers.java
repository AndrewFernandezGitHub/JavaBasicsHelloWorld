package com.syntax.class11;

public class Swap2Numbers {

	public static void main(String[] args) {
		// Write a program to swap 2 numbers without a temporary variable
		int a = 10;
		int b = 20;
		a = a + b;// 30
		System.out.println("a=a+b; a= " + a);
		System.out.println("b= " + b);
		b = a - b;
		System.out.println("b=a-b; b= " + b);
		a=a-b;
		System.out.println("a= "+a);
		System.out.println("b= "+b);

	}

}
