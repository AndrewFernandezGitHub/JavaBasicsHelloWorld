package com.syntax.class08;

public class LoopTask2 {
/*
 * print number from 1-50 except those that are divisible by 3
 */
	public static void main(String[] args) {
		for (int i=1; i<=50;i++) {
			if (i%3==0) {
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println("      ");
		// TODO Auto-generated method stub

	}

}
